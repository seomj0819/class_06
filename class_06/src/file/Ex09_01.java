package file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex09_01 {
	public static void main(String[] args) throws Exception{
		String path = "D:\\1월_핀테크 서민재\\eclipse-java\\workspace-java\\members01\\test.txt";
		FileInputStream fis = new FileInputStream( path );
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Ex09DTO dto = (Ex09DTO)ois.readObject();
		System.out.println("name : "+dto.getName());
		System.out.println("adr : "+dto.getAdr() );
	}
}




