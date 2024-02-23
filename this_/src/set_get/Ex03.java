package set_get;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		System.out.println("이름 입력 : ");
		name = input.next();
		System.out.println("나이 입력 : ");
		age = input.nextInt();
		Ex03_1 ex = new Ex03_1();
		ex.setAge(age);
		ex.setName(name);
		System.out.println(ex.getName() + " 님의 나이는 " + ex.getAge() + " 살 입니다.");
		
	}
}
