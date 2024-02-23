package abstract_;
abstract class Test01{
	public abstract void speed(); 
	public void myBreak() {
		System.out.println("멈춤 기능");
	}
}
class Testclass01 extends Test01{
	public  void speed() {
		System.out.println("2025");
	}
	public void autoSystem() {
		System.out.println("자동 운전 모드");
	}
	public void autoSystem1() {
		System.out.println("자동 운전 모드");
	}
	public void autoSystem2() {
		System.out.println("자동 운전 모드");
	}
	public void autoSystem3() {
		System.out.println("자동 운전 모드");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Testclass01 t = new Testclass01();
		t.speed(); t.myBreak(); t.autoSystem();
	}
}




