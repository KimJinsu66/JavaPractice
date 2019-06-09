import java.util.Scanner;
/**
 * 2개의 정수와 연산자를 입력받은 후 +,-,*,/ 연산하여 결과값을 출력하는 프로그램 
 * 사칙연산이 아닌 경우 에러 메시지 출력
 * 0으로 나눴을 때 return값이 0으로 나오도록 Div 클래스에서 예외처리
 * 
 * @author (2014671038 김진수, 2018315053 테라오카 유이카)
 * @version (2019.06.09)
 */
public class MyApp
{
    public static void main(String[] args){
        System.out.print("두 정수와 연산자를 입력하시오 >> ");
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt(); 
        int num_2 = sc.nextInt(); 
        String cal = sc.next();
        
        if (cal.equals("+")){     
            Add add = new Add();
            add.setValue(num_1,num_2);
            System.out.println(add.calculate());

        }
        else if (cal.equals("-")){ 
            Sub sub = new Sub();
            sub.setValue(num_1,num_2);
            System.out.println(sub.calculate());
        }
        else if (cal.equals("*")) {
            Mul mul = new Mul();
            mul.setValue(num_1,num_2);
            System.out.println(mul.calculate());

        }
        else if (cal.equals("/")) {
            Div div = new Div();
            div.setValue(num_1,num_2);
            System.out.println(div.calculate());

        }
        else{
            System.out.println("사칙연산자가 아닙니다.");
        }
        sc.close();
    }
}

