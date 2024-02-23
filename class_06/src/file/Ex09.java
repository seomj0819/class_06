package file;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ex09 {
	public static void main(String[] args) throws Exception {
		Ex09DTO dto = new Ex09DTO();
		dto.setName("홍길동");
		dto.setAdr("산골짜기");
		
		String path = "D:\\1월_핀테크 서민재\\eclipse-java\\workspace-java\\test01\\test.txt";
		FileOutputStream fos = new FileOutputStream(path , true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(dto);
		
		oos.close(); bos.close(); fos.close();
				
	}
}
