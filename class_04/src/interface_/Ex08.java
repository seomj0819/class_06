package interface_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface Testin{
	public int num = 1000;
	public static final String msg = "내용";
	public final String msg1 = "내용";
	public static String msg2 = "내용";
}
public class Ex08 {
	public final int num = 1000;
	public static void main(String[] args) {
		System.out.println( Testin.num );
		//Testin.num = 4567;
		List<String> arr = new ArrayList<>();
		Map<String, String> m = new HashMap<>();
	}
}










