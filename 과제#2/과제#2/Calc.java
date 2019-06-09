
/**
 * int 타입의 a,b 필드, setValue(),calculate() 메소드를 포함하는 추상클래스 
 *
 * @author (2014671038 김진수, 2018315053 테라오카 유이카)
 * @version (2019.06.09)
 */
public abstract class Calc
{
    int a;
    int b;

    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }

    public abstract int calculate();
}
