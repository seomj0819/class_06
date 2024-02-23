package set_get;
class Test02{
	private int num, age; //은닉화
//은닉화 진행후 그 안에 setter ahd getter 집어 넣은게 캡슐화
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	} 

	//	public void setNum(int n) {
	//		this.num =num;
	//	}
	//	public int getNum() {
	//		return num;
	//	}
	//	public void setAge (int a) {
	//		age = a;
	//	}
	//	public int getAge() {
	//		return age;
	//	}
}
public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.setNum(100);
		t.setAge(20);
		int a = t.getAge();
		System.out.println("age : " +a);
		System.out.println(t.getNum());
	}
}
