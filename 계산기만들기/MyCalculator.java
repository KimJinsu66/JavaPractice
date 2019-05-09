import java.util.Scanner;

/**
 * 계산식을 입력받아서 계산하는 프로그램(팀 프로젝트)
 * 두번째 숫자가 0이면 에러가 나온다.
 * 사칙연산이 아닌 문자를 입력하면 에러가 나온다.
 * @author (2014671038 김진수, 2014690145 전성환)
 * @version (20190410)
 */
public class MyCalculator
{   
    public static void main(String[] args){

        System.out.print("계산식 >> ");
        Scanner sc = new Scanner(System.in);
        double num_1 = sc.nextDouble(); 
        String cal = sc.next(); 
        double num_2 = sc.nextDouble(); 

        if (cal.equals("+")){     
            System.out.println(num_1 + cal + num_2 +" 의 계산결과는 " + (num_1 + num_2));
        }
        else if (cal.equals("-")){ 
            System.out.println(num_1 + cal + num_2 +" 의 계산결과는 " + (num_1 - num_2));
        }
        else if (cal.equals("*")) {
            System.out.println(num_1 + cal + num_2 +"의 계산결과는 " + (num_1 * num_2));
        }
        else if (cal.equals("/")) {
            if(num_2 == 0) {
                System.out.println("0으로 나눌 수 없습니다!");
            }
            else {
                System.out.println(num_1 + cal + num_2 +"의 계산결과는 " + (num_1 / num_2));
            }
        }
        else{
            System.out.println("사칙연산자가 아닙니다.");
        }
        sc.close();
    }
}
