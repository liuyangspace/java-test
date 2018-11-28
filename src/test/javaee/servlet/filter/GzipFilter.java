package test.javaee.servlet.filter;

import javax.servlet.Filter;
import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

public class GzipFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        GzipHttpResponse gzipHttpResponse = new GzipHttpResponse((HttpServletResponse) response);
        chain.doFilter(request,gzipHttpResponse);
        gzipHttpResponse.gzip();
    }

    class GzipHttpResponse extends HttpServletResponseWrapper {

        private ByteArrayOutputStream byteArrayOutputStream;
        private PrintWriter printWriter;
        private ServletOutputStream servletOutputStream;

        /**
         * Constructs a response adaptor wrapping the given response.
         *
         * @param response The response to be wrapped
         * @throws IllegalArgumentException if the response is null
         */
        public GzipHttpResponse(HttpServletResponse response) {
            super(response);
            response.setHeader("Content-encoding","gzip");
            response.setHeader("Content-Type","text/html;charset=utf-8");

            byteArrayOutputStream = new ByteArrayOutputStream();
        }

        @Override
        public PrintWriter getWriter() throws IOException {
            if(printWriter==null) printWriter = new PrintWriter(new OutputStreamWriter(byteArrayOutputStream));
            return printWriter;
        }

        @Override
        public ServletOutputStream getOutputStream() throws IOException {
            if(servletOutputStream==null) servletOutputStream = new ServletOutputStream() {
                @Override
                public boolean isReady() {
                    return false;
                }

                @Override
                public void setWriteListener(WriteListener listener) {

                }

                @Override
                public void write(int b) throws IOException {
                    byteArrayOutputStream.write(b);
                }
            };
            return servletOutputStream;
        }

        public void gzip() throws IOException {
            if(printWriter!=null) printWriter.close();
            if(servletOutputStream!=null) servletOutputStream.close();
            byteArrayOutputStream.close();
            System.out.println("BeforeGzip:"+byteArrayOutputStream.toByteArray().length);
            System.out.println("AfterGzip:"+gzip(byteArrayOutputStream.toByteArray()).length);
            byte[] bytes= gzip(byteArrayOutputStream.toByteArray());
            super.getOutputStream().write(bytes);
            super.getOutputStream().close();
        }

        private byte[] gzip(byte[] bytes) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gzipOutputStream.write(bytes);
            gzipOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        }
    }

    @Override
    public void destroy() {

    }
}
