package Chapter11;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("���ű�");array.add("����");
		array.add("�ٶ���");array.add("��");
		
		Iterator<String> it = array.iterator();
		while(it.hasNext()){
			String check = it.next();
			if (check.length() ==3 ){
				System.out.println(check);
			}
			
		}
	}

}
