package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) throws IOException {
	Scanner input = new Scanner(System.in);
	String path = "C:/0.공유자료/0.핀테크/test/";
	
	System.out.println("파일명 입력");
	String fileName = input.next();
	
	File filePath = new File(path+fileName+".txt");
	
	if( filePath.exists() ) {
		System.out.println("이미 존재하는 파일입니다.");
	} else {
		FileOutputStream fos = new FileOutputStream(filePath);
		String msg;
		System.out.println( "내용을 입력하세요");
		input.nextLine();
		msg = input.nextLine();
		fos.write( msg.getBytes() );
		System.out.println("저장 되었습니다");
	}
}
}