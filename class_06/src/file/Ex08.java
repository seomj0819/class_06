package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex08 {
	public static void main(String[] args) throws Exception {
		String path = "D:\\1월_핀테크 서민재\\eclipse-java\\workspace-java\\test01\\test.txt";
		FileOutputStream fos = new FileOutputStream(path , true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeUTF("안녕하세요");
		dos.writeInt(100);
		dos.writeDouble(1.111);
		//스트림을 닫을때는 역순
		dos.close();
		bos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String msg = dis.readUTF();
		int num = dis.readInt();
		double dou = dis.readDouble();
		System.out.println(msg);
		System.out.println(num);
		System.out.println(dou);
	}
}
