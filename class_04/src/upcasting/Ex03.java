package Upcasting;
class Test{}
public class Ex03 {
	public static void main(String[] args) {
		Object num = 100;
		Object name = "홍길동";
		Object t = new Test();
		System.out.println( num.getClass()  );
		System.out.println( name.getClass()  );
		
		int a = 100 + (int)num;
		System.out.println( a );
	}
}
