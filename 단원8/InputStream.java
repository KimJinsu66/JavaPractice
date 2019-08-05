package 단원8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try{
			fin = new FileInputStream("C:/Users/user/workspace1/JavaProgramming/javatest.txt");
			in = new InputStreamReader(fin,"MS949"); //MS에서 만든 한글 확장 완성형 문자 집합
			int c;
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while(( c = in.read()) != -1){
				System.out.print((char)c);	
			}
			in.close();
			fin.close();
			
		}catch(IOException e){
			System.out.println("입출력 오류");
			
		}
	}

}
