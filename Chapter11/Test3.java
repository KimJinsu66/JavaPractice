package Chapter11;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> map = new Hashtable<>();
		map.put("a", 20); map.put("�ְ��", 56);
		map.put("����", 16); map.put("���ڹ�", 35);
		System.out.print("�̸��� �Է��ϼ���");
		String name = sc.next();
		
		System.out.println(map.get(name));
	}

}
