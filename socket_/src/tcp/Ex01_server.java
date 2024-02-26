package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Ex01_server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		System.out.println("접속을 기다립니다!!!");
		
		Socket sock = server.accept();
		System.out.println("클라이언트 연결되었습니다!!!!");
		
		InputStream is = sock.getInputStream();
		int readData = is.read();
		System.out.println("수신 데이터 : "+readData);
		
		is.close(); sock.close(); server.close();
	}

}










