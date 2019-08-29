
/**
 * Write a description of class ColorPoint here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ColorPoint extends Point
{
    private String color;
    public void setColor(String color){
        this.color = color;
    }

    public void showColorPoint(){
        System.out.print(color);
        showPoint();
    }
}
