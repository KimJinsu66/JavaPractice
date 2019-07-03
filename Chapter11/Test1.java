package Chapter11;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("갈매기");array.add("나비");
		array.add("다람쥐");array.add("라마");
		
		Iterator<String> it = array.iterator();
		while(it.hasNext()){
			String check = it.next();
			if (check.length() ==3 ){
				System.out.println(check);
			}
			
		}
	}

}
