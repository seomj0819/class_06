package this_;
class Test01{
	public int num = 13245;
	public void test() {
		int num = 3000000;
		System.out.println("this : " + this);
		System.out.println("this : " + this.num);
	System.out.println("NUM  : " +  num );
	}
}
public class Ex01 {
public static void main(String[] args) {
	Test01 t = new Test01();
	System.out.println("main : "+t);
	System.out.println("main num : " + t.num);
	
	t.test();
}}
