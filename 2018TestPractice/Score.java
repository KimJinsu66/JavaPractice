
/**
 * Write a description of class Score here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Score
{
    public static void main(String[] args){
        String[] sub = {"Korean", "Math", "English", "Science", "Society"};
        int[] std1 = {58, 78, 68, 85, 87};
        int[] std2 = {85, 56, 86, 75, 74};
        int[] std3 = {75, 85, 78, 86, 98};
        int[] std4 = {95, 57, 92, 68, 78};
        int[] std5 = {75, 74, 85, 78, 65};
        int[] std6 = {54, 75, 45, 86, 88};
        int[][] stds = {std1, std2, std3, std4, std5, std6};

        for(int i = 0 ; i <stds.length ; i++){
            int sum = 0;
            for(int j = 0 ; j <stds[i].length ; j ++){
                sum += stds[i][j];
            }
            System.out.println("name : " + "std" + (i+1 ) + "점수는 " + ((double)sum/stds[i].length));
        }
        System.out.println("각 과목의 평점은 : ");

        for(int i = 0 ; i <stds[i].length ; i++){
            int sum = 0;
            for(int j = 0 ; j <stds.length ; j ++){
                sum += stds[j][i];
            }
            System.out.println("각 과목의 평점은 " + sub[i] + ((double)sum/stds.length));
        }
        
        System.out.println("점수가 90점 이상인 과목이 있는 학생의 학생명과 과목 :점수");
        
        for(int i = 0 ; i <stds.length ; i++){
            int sum = 0;
            for(int j = 0 ; j <stds[i].length ; j ++){
                if(stds[i][j] >= 90){
                    System.out.println("학생명 : stds "+(i+1) + "과목 :" + sub[i] + "점수 : " + stds[i][j]  );
                }
                
            }
            
            
        }
        
    }
}
