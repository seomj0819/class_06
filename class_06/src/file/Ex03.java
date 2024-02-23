package file;

import java.io.File;

public class Ex03 {
public static void main(String[] args) {
	String sPath = "c:/test/";
	File fPath = new File("C:/0.공유자료/0.핀테크/abcd");
	fPath.mkdir();
	fPath.delete();
	
	fPath = new File("C:/0.공유자료/0.핀테크");
	String[] s = fPath.list();
	
	System.out.println( s.length );
	for( String ss :  s) {
		System.out.println( ss );
	}
	
	System.out.println( fPath.exists() );
}
}





