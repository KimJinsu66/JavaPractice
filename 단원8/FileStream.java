package �ܿ�8;

import java.io.File;

public class FileStream {

	public static void main(String[] args) {
 // ���� ���丮 �������� test.txt���������� ���
        
        File f = new File("./test.txt");
        
        //������ ���� ����
        System.out.println("������ ���� ���� " + f.exists());
        System.out.println("������ ũ�� " + f.length());
        System.out.println("������ ������ ������¥ " + f.lastModified()/1000/86400);}

}
