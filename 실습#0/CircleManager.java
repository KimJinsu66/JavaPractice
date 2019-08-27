import java.util.Scanner;
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class Circle{
    private double x,y;
    private int radius;
    public Circle(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show(){
        System.out.println("(" + this.x + "," + this.y + ")" +this.radius);
    }
}

public class CircleManager{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Circle[] c = new Circle[3];
        
        for(int i = 0; i< c.length; i++){
            System.out.print("x,y,radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x,y,radius);
        }
        for(int i = 0; i< c.length; i++){ 
            c[i].show();//모든 Circle 객체 출력
        }
        scanner.close();
    }
    
}
