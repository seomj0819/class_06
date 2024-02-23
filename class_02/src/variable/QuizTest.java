package variable;

import java.util.Scanner;

public class QuizTest {
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	public void inputData() {
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력");
		name = input.next();
		System.out.println("국어 입력");
		kor = input.nextInt();
		System.out.println("영어 입력");
		eng = input.nextInt();
		System.out.println("수학 입력");
		math = input.nextInt();
		System.out.println("--- 모두 입력 되었습니다 ---");
	}
	public void operationData() {
		sum = kor + eng + math;
		avg = sum / 3.0;
		if(avg >= 90) {
			grade = "A 등급";
		}else if(avg >= 80 ) {
			grade = "B 등급";
		}else {
			grade = "C 등급";
		}
	}
	public void printData() {
		System.out.println("===============");
		System.out.println(name + "님 인적사항");
		System.out.println("===============");
		System.out.println("이름\t국\t영\t수\t합\t평균\t등급");
		System.out.println("-----------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+
		math+"\t"+sum+"\t"+avg+"\t"+grade);
		System.out.println("-----------------------------");
	}
}





