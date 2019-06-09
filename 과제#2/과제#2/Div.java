/**
 * 나눗셈을 하고 결과를 리턴한다.
 * 0으로 나눴을 때 return값이 0으로 나오도록 예외처리
 * @author (2014671038 김진수, 2018315053 테라오카 유이카)
 * @version (2019.06.09)
 */
public class Div extends Calc
{
    public int calculate(){
        try{
            return a / b;
        }catch (ArithmeticException e){
            return 0;
        }

    } 
}
