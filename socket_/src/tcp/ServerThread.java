package tcp;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerThread extends Thread{
	public static ArrayList<Socket> sArr = new ArrayList<>();
	Socket sock = null;
	public ServerThread(Socket sock) {
		System.out.println(sock.getInetAddress()+" 님이 접속했습니다.");
		this.sock = sock; sArr.add(sock); start();
	}
	public void run() {
		try {
			InputStream in = sock.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			while(true) {
				String readData = dis.readUTF();
				for(Socket s : sArr) {
					OutputStream out = s.getOutputStream();
					DataOutputStream dos = new DataOutputStream(out);
					dos.writeUTF(readData);
				}
			}
		} catch (IOException e) { e.printStackTrace(); }
	}

}
