package tcp;

import java.net.ServerSocket;

public class Server01 {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345); 
		int i=0;
		while(true) {
		System.out.println("접속을 기다립니다");
		new ServerThread( server.accept() );
		}
		}

}
