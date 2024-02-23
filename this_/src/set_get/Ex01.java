package set_get;
class Test01 {
	public int num = 12345;
	public void test (int n) {
		num = n;
		
	}
	public int test2() {
		return num;
		}
	}
public class Ex01 {
	public static void main (String[] args) {
		Test01 t = new Test01();
		t.test (1000);
		System.out.println(t.test2());
	}
}