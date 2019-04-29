import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Write a description of class Exercise8_8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise8_8
{
    public static void main(String[] args){

        Random random = new Random();
        int random_num = random.nextInt(100);
        System.out.println(random_num);
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 ");
        int num = 0;
        while(true){
            try{
                num = sc.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("정수를 입력하세요 ");
                sc.next();
                continue;
            }
            if (random_num == num){
                System.out.println("정답입니다");
                break;
            }
            else{
                if(random_num > num){
                    System.out.println("더 큰수를 입력하세요 ");
                }
                else{
                    System.out.println("더 작은수를 입력하세요 ");
                }
            }
        }
    }
}