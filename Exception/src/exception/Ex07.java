package exception;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 0;
		System.out.println("나이 입력");
		try {
			age = input.nextInt();
			if (age <=0) {
				throw new Exception("음수는 입력할 수 없습니다");
				
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("당신의 나이는 : " + age);
	}
}
