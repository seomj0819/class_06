package Overriding;

import java.util.ArrayList;

class Test02 extends ArrayList<String>{
	public String get(int i) {
		System.out.println( super.get(i) );
		return super.get(i);
	}
	@Override
	public boolean add(String e) {
		System.out.println("저장되었습니다!!!");
		return super.add(e);
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.add("111");
		t.add("222");
		t.add("333");
		t.get( 2 );
		
	}
}





