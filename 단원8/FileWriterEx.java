package 단원8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try{
			fout = new FileWriter("C:/Users/user/workspace1/JavaProgramming/javatest.txt");//파일과 연결된 출력 문자 스트림 생성
			while(true){
				String line = scanner.nextLine();//빈칸을 포함하여 한 줄 읽기
				if(line.length() == 0)// 한줄에 Enter 키만 입력한경우
					break;
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			fout.close();
		}catch(IOException e){
			System.out.println("입출력 오류");
			
		}
		scanner.close();
	}

}
