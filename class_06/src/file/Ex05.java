package file;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1, s2;
		int num;
		while(true)
			try {
				System.out.println("수 입력" );
				num = input.nextInt();
				System.out.println((" 입력 값 : " + num));

			}catch (Exception e) {
				s1 = input.nextLine();
				System.out.println(s1+ "수 입력하세요");
			}
		//	System.out.println("1. 문자열 입력");
		//	s1 = input.next();
		//	System.out.println("2. 문자열 입력");
		//	s2 = input.nextLine();
		//	System.out.println("s1 : " + s1);
		//	System.out.println("s2 : " + s2);
		//	
	}
} 

