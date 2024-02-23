package exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input close;
		int x;

		System.out.println("수 입력");
		x= input.nextInt();
		try {
			int result =10 /x ;
			System.out.println("결과 : result " + result);
			return;

		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally 실행");
		}
		System.out.println("다음 문장들 실행!!!");

	}
}