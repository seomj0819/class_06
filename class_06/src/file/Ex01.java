package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
public static void main(String[] args) throws IOException {
	File path = new File("D:\\1월_핀테크 서민재\\eclipse-java\\workspace-java\\test01\\test.txt");
	FileOutputStream fos = new FileOutputStream(path);
	fos.write(97); // 해당하는 값이 문자로 저장됨
	fos.write('a');
	fos.write("test".getBytes());
	
}
}
