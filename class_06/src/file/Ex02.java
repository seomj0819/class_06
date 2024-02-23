package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) throws Exception {
	Scanner input = new Scanner(System.in);
	String path ="D:\\1월_핀테크 서민재\\eclipse-java\\workspace-java\\test02.txt";
	FileOutputStream fos = new FileOutputStream(path);
	
	System.out.println("출력할 내용 입력");
	String name = input.next();
	
	fos.write(name.getBytes());
	System.out.println("저장 되었습니다.");
}
}
