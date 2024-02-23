package class_03;
class TestClass01{
	public TestClass01() {
		System.out.println("생성자 실행");
	}
	public void test() {
		System.out.println("test 호출");
	}
}
public class Ex01 {
//객체를 초기화 하는 목적	
	public static void main(String[] args) {
		TestClass01 t = new TestClass01(); //이때 생성자가 호출이 되었다가 사라짐 (반환값 없음)
		//t.test();
	}
}
