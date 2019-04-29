
/**
 * 예제 3-13 : main()에서 명령행 인자의 합 계산
 *
 *
 * @author (2014671038 김진수)
 * @version (20190429)
 */
public class Test
{
    public static void main(String[] args){
        //입력

        double sum = 0.0;
        // 계산
        for(int i =0; i < args.length; i++){
            sum += (Double.parseDouble(args[i]));
        }
        // 출력

        System.out.println(sum);
    }
}
