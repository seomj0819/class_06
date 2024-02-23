package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06 {
	public static void main(String[] args) throws Exception{
		String path = "D:\\1월_핀테크 서민재\\eclipse-java\\workspace-java\\test01\\test.txt";
		FileOutputStream fos = new FileOutputStream(path , true); // 파일이 없으면 만들고 작성, 기존에 있으면 유지 하면서 추가
		fos.write('c');
		fos.close(); //메모리상 이득/ 다시 작성하려면 또 열어야 한다
		FileOutputStream fos1 = new FileOutputStream(path , true);
		fos1.write('d');
		fos1.close();
		
		FileInputStream fis = new FileInputStream(path);
		int re = fis.read();
		System.out.println((char)re);
		while(true) {
			re = fis.read();
			if (re<0) {
				System.out.println("내용이 없습니다 : " + re);
				break;
			}
			System.out.println((char)re);
			
		}
		fis.close();
		
	}
}
