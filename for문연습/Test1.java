import java.util.Scanner;
/**
 * 두양의 정수를 입력하면 해당범위 숫자의 합을 계산하는 hap() 함수를 작성하시오.
 * 단 숫자는 작은수, 큰 수의 순에 관계없이 입력한다.
 * @author (KIM JINSU)
 * @version (2019.05.23)
 */
public class Test1
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 수 입력 : ");
        int num2 = sc.nextInt();
        int sum = 0;
        if (num1 <num2){
            
            for(int i = num1 ; i < num2+1; i++){
                sum += i;
            }    
        }
        else{
            for(int i = num1 ; i > num2-1; i--){
                sum+= i;
            }
        }
        System.out.println(num1 + "부터"+num2 + "까지의 합 : "+ sum);
        
        
        }
}
