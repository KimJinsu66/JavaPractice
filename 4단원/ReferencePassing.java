
/**
 * 여기에 ReferencePassing 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */

class Circle{
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    
}
public class ReferencePassing
{
    static void increase(Circle m){
        m.radius++; 
    
    }
    
    public static void main(String args[]){
        Circle pizza = new Circle(10);
        increase(pizza);
        System.out.println(pizza.radius);
    }
}
