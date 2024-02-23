package class_03;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Practice01 p = new Practice01();
		p.display();
		 int num;
		System.out.println("1. 로그인 \t2. 회원가입 \t3. 탈퇴");
		System.out.print(">>>");
		num = input.nextInt();
		
		if (num == 1) {
			System.out.println("id : ");
			System.out.println("pw : ");
		}else if (num == 2) {
			System.out.println("id : ");
			System.out.println("pw : ");
		}else if (num == 3) {
			System.out.println("id : ");
			System.out.println("pw : ");
		}else {
			System.out.println("잘못된 입력값 입니다.");
		}
	}
}
