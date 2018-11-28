package test.javase.web;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.InetAddress;
import java.net.ServerSocket;

public class Socket {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8080,10,InetAddress.getByName("localhost"));
        java.net.Socket socket = serverSocket.accept();
        Writer writer = new OutputStreamWriter(socket.getOutputStream());
        writer.write("HTTP/1.1 200 OK\n" +
                "Date: Sat, 31 Dec 2005 23:59:59 GMT\n" +
                "Content-Type: text/html;charset=ISO-8859-1\n" +
                "Content-Length: 3\n" +
                "\n" +
                "123\n"
        );

        writer.close();
        socket.close();
        serverSocket.close();
    }
}
