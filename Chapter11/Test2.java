package Chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		set.add(new Person("김열공" , 20)); set.add(new Person("최고봉" , 56));
		set.add(new Person("우등생",16));set.add(new Person("나자바" , 35));
		
		Iterator<Person> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}

}
