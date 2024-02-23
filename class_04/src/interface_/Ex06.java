package interface_;
class Test07{
	public void test() {
		System.out.println("새로운 기능으로 만듭니다");
	}
}
class Test06{
	public void test() {
		System.out.println("test기능입니다");
	}
}
class Singleton06{
	TestClass07 t01 = new TestClass07();
}
public class Ex06 {
public static void main(String[] args) {
	TestClass07 t01 = new TestClass07();
	t01.test();
}
}









