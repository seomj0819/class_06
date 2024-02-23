package variable;
class Test07{
	public static final String KOREA = "대한민국";
	public static int num;
	public int su;
	static {
		num = 12345;
	}
	public void test() { System.out.println("test호출");}
}
public class Ex07 {
public static void main(String[] args) {
	//final String KOREA = "대한민국";
	//KOREA = "미국";
	System.out.println( Test07.KOREA );
	System.out.println( Test07.num );
	
	Test07 t = new Test07();
	System.out.println( t.KOREA );
	t.test();
}
}








