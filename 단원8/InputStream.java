package �ܿ�8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try{
			fin = new FileInputStream("C:/Users/user/workspace1/JavaProgramming/javatest.txt");
			in = new InputStreamReader(fin,"MS949"); //MS���� ���� �ѱ� Ȯ�� �ϼ��� ���� ����
			int c;
			System.out.println("���ڵ� ���� ������ " + in.getEncoding());
			while(( c = in.read()) != -1){
				System.out.print((char)c);	
			}
			in.close();
			fin.close();
			
		}catch(IOException e){
			System.out.println("����� ����");
			
		}
	}

}
