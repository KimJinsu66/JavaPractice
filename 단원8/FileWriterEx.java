package �ܿ�8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try{
			fout = new FileWriter("C:/Users/user/workspace1/JavaProgramming/javatest.txt");//���ϰ� ����� ��� ���� ��Ʈ�� ����
			while(true){
				String line = scanner.nextLine();//��ĭ�� �����Ͽ� �� �� �б�
				if(line.length() == 0)// ���ٿ� Enter Ű�� �Է��Ѱ��
					break;
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			fout.close();
		}catch(IOException e){
			System.out.println("����� ����");
			
		}
		scanner.close();
	}

}
