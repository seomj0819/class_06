package file;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex07 {
public static void main(String[] args) throws Exception {
	String path = "D:\\1월_핀테크 서민재\\eclipse-java\\workspace-java\\test01\\test.txt";
	FileOutputStream fos = new FileOutputStream(path , true);
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	for (char ch = '0' ; ch<= '9' ; ch++) {
		Thread.sleep(1);
		//fos.write(ch);
		bos.write(ch); //임시 저장공간에 저장 (파일로 저장하려면 따로 명령어 입력)
		
	}
	bos.flush();
	bos.write('a');
	bos.close(); //전송 하면서 경로를 끊는다 /이후 write 사용 불가
	fos.close();
}
}
