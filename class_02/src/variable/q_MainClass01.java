package variable;

import java.util.Scanner;

public class q_MainClass01 {
	public static void main(String[] args) {
		q_TestClass01 t = new q_TestClass01();
		String name, grade = q_TestClass01;
		int kor, eng, math, sum = q_TestClass01
		Scanner input = new Scanner(System.in);
		System.out.println("이름 : ");
		t.name = input.next();
		System.out.println("국어 : ");
		t.kor = input.next();
		System.out.println("영어 : ");
		t.eng = input.next();
		System.out.println("수학 : ");
		t.math = input.next();
		
		sum = kor+eng+math;
		t.avg = sum/3;
		
		if (t.avg>=90) {
			t.grade = "A";
		}else if (t.avg>=80 && t.avg<90) {
			t.grade = "B";
		}else {
			t.grade = "c";			
		}
		System.out.println("이름 : " + t.name);
		System.out.println("평균 : " + t.avg);
		System.out.println("등급 : " + t.grade);
	}
}
