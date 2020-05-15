package test.javaee.servlet;

import org.apache.tomcat.util.http.fileupload.*;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.List;

/**
 * http协议参考(http://www.ietf.org/rfc/rfc1341.txt)
 * http post 文件 数据格式:
 *  POST /logsys/home/uploadIspeedLog!doDefault.html HTTP/1.1                                        // http头部信息
 *  Accept: text/plain
 *  Accept-Language: zh-cn
 *  Host: 192.168.24.56
 *  Content-Type:multipart/form-data;boundary=-----------------------------7db372eb000e2            // boundary=...为文件分割标识
 *  User-Agent: WinHttpClient
 *  Content-Length: 3693
 *  Connection: Keep-Alive
 *                                                                                                  // 空行，下一行http消息体开始
 *  -------------------------------7db372eb000e2                                                    // 文件分割开始
 *  Content-Disposition: form-data; name="file"; filename="kn.jpg"                                  // 文件描述信息
 *  Content-Type: image/jpeg                                                                        // 文件类型信息
 *                                                                                                  // 空行，下一行文件二进制正文开始
 *  (此处省略jpeg文件二进制数据...）                                                                // 文件二进制正文
 *  -------------------------------7db372eb000e2--                                                  // 文件结束
 *
 * 常用上传框架:
 *  apache-fileupload
 *  Orialiy – COS – 2008()
 *  Jsp-smart-upload – 200M
 *
 */
public class Upload extends HttpServlet {

    public void form(HttpServletRequest req, HttpServletResponse resp) throws IOException, FileUploadException, ServletException {
        req.getRequestDispatcher("/view/admin/file.jsp").include(req,resp);
    }

    // 下载文件(多线程断点下载)
    public void testDownload2(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    // 下载文件(单线程连续下载)
    public void testDownload1(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        req.setCharacterEncoding("UTF-8");
        //第一步：设置响应的类型
        resp.setContentType("application/force-download");
        //第二读取文件
        String path = "";
        InputStream in = new FileInputStream(path);
        //设置响应头
        //对文件名进行url编码
        String name = "";
        name = URLEncoder.encode(name, "UTF-8");
        resp.setHeader("Content-Disposition","attachment;filename="+name);
        resp.setContentLength(in.available());

        //第三步：开始文件copy
        OutputStream out = resp.getOutputStream();
        byte[] b = new byte[1024];
        int len = 0;
        while((len=in.read(b))!=-1){
            out.write(b,0,len);
        }
        out.close();
        in.close();
    }

    // 文件解析加速
    public void testUpload4(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory(10240,new java.io.File("E:\\myplace\\test\\java-web\\data\\upload"));
        ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
        FileItemIterator fileItemIterator = servletFileUpload.getItemIterator(req);
        PrintWriter printWriter = resp.getWriter();
        while (fileItemIterator.hasNext()){
            FileItemStream fileItemStream = fileItemIterator.next();
            if(fileItemStream.isFormField()){

            }else {
                String fileName = fileItemStream.getFieldName().substring(fileItemStream.getFieldName().lastIndexOf("\\")+1);
                printWriter.write("文件："+fileName+"<br>");

                OutputStream outputStream = new FileOutputStream(new java.io.File("E:\\myplace\\test\\java-web\\data\\upload\\"+fileName));
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileItemStream.openStream());
                byte[] bytes = new byte[1024];
                while ((bufferedInputStream.read(bytes))!=-1){
                    outputStream.write(bytes);
                }
                outputStream.close();
                bufferedInputStream.close();
            }
        }
        printWriter.write("testUpload4-fast");
        printWriter.close();
    }

    // tomcat 文件工具解析文件
    public void testUpload3(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory(10240,new java.io.File("E:\\myplace\\test\\java-web\\data\\upload"));
        FileUpload fileUpload = new FileUpload(diskFileItemFactory);
        List<FileItem> fileItemList = fileUpload.parseRequest(new ServletRequestContext(req));
        PrintWriter printWriter = resp.getWriter();
        for(FileItem fileItem:fileItemList){
            if(fileItem.isFormField()){//key=value
                printWriter.write("key："+fileItem.getFieldName()+" = "+fileItem.getString("UTF-8")+"<br>");
            }else {//文件
                String fileName = fileItem.getFieldName().substring(fileItem.getFieldName().lastIndexOf("\\")+1);
                printWriter.write("文件："+fileName+"<br>");

                // OutputStream outputStream = new FileOutputStream(new java.io.File("E:\\myplace\\test\\java-web\\data\\upload\\"+fileItem.getName()));
                // BufferedInputStream bufferedInputStream = new BufferedInputStream(fileItem.getInputStream());
                // byte[] bytes = new byte[1024];
                // int bl;
                // while ((bl = bufferedInputStream.read(bytes))!=-1){
                //     outputStream.write(bytes);
                // }
                // outputStream.close();
                // bufferedInputStream.close();

                fileItem.write(new java.io.File("E:\\myplace\\test\\java-web\\data\\upload\\"+fileName));
                fileItem.delete();
            }
        }
        printWriter.write("testUpload3");
        printWriter.close();
    }

    // 手动提取post文件
    public void testUpload2(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
        try {
            InputStream inputStream = req.getInputStream();
            OutputStream outputStream = resp.getOutputStream();

            String filePath = "E:\\myplace\\test\\java-web\\data\\test.png";
            System.out.println(filePath);
            java.io.File file = new java.io.File(filePath);
            if(!file.exists()){
                file.createNewFile();
            }
            System.out.println(filePath);
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            // byte[] bytes = new byte[1024];
            // while (inputStream.read(bytes)!=-1){
            //     outputStream.write(bytes);
            //     fileOutputStream.write(bytes);
            // }

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String limitStr = bufferedReader.readLine();
            String tmpStr = "";
            //tmpStr=bufferedReader.readLine();
            //tmpStr=bufferedReader.readLine();
            while ((tmpStr=bufferedReader.readLine())!=null){
                if(limitStr.equals(tmpStr)){
                    break;
                }
                outputStream.write((tmpStr+"\n").getBytes());
            }

            outputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(new String(e.getMessage().getBytes("GBK"),"UTF-8"));
        }
    }

    // 手动解析post文件信息
    public void testUpload(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException,IOException {
        req.setCharacterEncoding("UTF-8");
        String txt = req.getParameter("txt");//返回的是null
        System.err.println("txt is :"+txt);
        System.err.println("=========================================");
        InputStream in = req.getInputStream();
//		byte[] b= new byte[1024];
//		int len = 0;
//		while((len=in.read(b))!=-1){
//			String s = new String(b,0,len);
//			System.err.print(s);
//		}
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String firstLine = br.readLine();//读取第一行，且第一行是分隔符号
        String fileName = br.readLine();
        fileName = fileName.substring(fileName.lastIndexOf("\\")+1);// bafasd.txt"
        fileName = fileName.substring(0,fileName.length()-1);

        br.readLine();
        br.readLine();
        String data = null;
        //获取当前项目的运行路径
        String projectPath = getServletContext().getRealPath("/up");
        PrintWriter out  = new PrintWriter(projectPath+"/"+fileName);
        while((data=br.readLine())!=null){
            if(data.equals(firstLine+"--")){
                break;
            }
            out.println(data);
        }
        out.close();
    }
}
