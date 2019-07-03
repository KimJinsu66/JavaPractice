package Chapter11;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> map = new Hashtable<>();
		map.put("a", 20); map.put("최고봉", 56);
		map.put("우등생", 16); map.put("나자바", 35);
		System.out.print("이름을 입력하세요");
		String name = sc.next();
		
		System.out.println(map.get(name));
	}

}
