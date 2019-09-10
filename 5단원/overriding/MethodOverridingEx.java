
/**
 * Overriding
 *
 * @author (김진수)
 * @version (2019.08.31)
 */
class Shape{
    public Shape next;
    public Shape(){next = null;}//
    
    public void draw(){
    System.out.println("Shape");
    }
}
class Line extends Shape{
    public void draw(){
        System.out.println("Line"); //메소드 오버라이딩
    }
}
class Rect extends Line{
    public void draw(){
        System.out.println("Circle"); //메소드 오버라이딩
    }
}
abstract class Circle{
    abstract public void draw();
    //추상 클래스에 추상 메소드 선언
}
abstract class MyComponent{
    //추상 클래스만 선언함
}

public class MethodOverridingEx{
    static void paint(Shape p){
    p.draw();// p가 가리키는 객체 내에 오버라이딩된 draw() 호출. 동적 바인딩
}
public static void main(String[] args){
        Line line = new Line();
        paint(line);
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
    }
}
   


