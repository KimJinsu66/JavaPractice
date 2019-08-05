package 단원8;

import java.io.File;

public class FileStream {

	public static void main(String[] args) {
 // 현재 디렉토리 폴더안의 test.txt파일정보를 출력
        
        File f = new File("./test.txt");
        
        //파일의 존재 여부
        System.out.println("파일의 존재 여부 " + f.exists());
        System.out.println("파일의 크기 " + f.length());
        System.out.println("파일의 마지막 수정날짜 " + f.lastModified()/1000/86400);}

}
