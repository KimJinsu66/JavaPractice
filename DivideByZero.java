import java.util.Scanner;
/**
 * 두 정수를 입력 받아 나눗셈을 하고 몫을 구하여 출력하는 프로그램
 *
 * @author (2014671038 김진수)
 * @version (20190429)
 */
public class DivideByZero
{
    public static void main(String[] args){
        //입력
        Scanner sc = new Scanner(System.in);
        System.out.println("나뉨수를 입력하시오 : ");
        int dividend = sc.nextInt();
        System.out.println("나눗수를 입력하시오 : ");
        int divisor = sc.nextInt();
        try{
            double result = dividend / divisor;
            System.out.println(result);    
        }
        catch(ArithmeticException e ){
            System.out.println("0으로 나눌수 없습니다! ");
        }
        //출력

    }
}
