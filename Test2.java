package Chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		set.add(new Person("�迭��" , 20)); set.add(new Person("�ְ��" , 56));
		set.add(new Person("����",16));set.add(new Person("���ڹ�" , 35));
		
		Iterator<Person> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}

}
