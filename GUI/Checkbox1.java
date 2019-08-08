package GUI;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

public class Checkbox1  extends Frame
{
    // 레이블이 있는 생성자
    public Checkbox1(String str)
    {
        super(str); // 패널 생성
        Panel p = new Panel(); // 치킨 체크 박스 체크 표시
        Checkbox cbx1=new Checkbox("치킨", true);
        // 피자 체크 박스 디폴트여도 true
        Checkbox cbx2=new Checkbox("피자");    
        // 피자 체크 박스 디폴트여도 true
        Checkbox cbx3=new Checkbox("햄버거");
        // 패널에 생성
        p.add(cbx1);
        p.add(cbx2);
        p.add(cbx3);
        
        // 체크 박스 그룹 생성
        CheckboxGroup group = new CheckboxGroup();
        // 치킨 체크 박스 체크 표시
        Checkbox cbx4=new Checkbox("치킨",group,true);
        // 피자 체크 박스 체크 표시X
        Checkbox cbx5=new Checkbox("피자",group,false);    
        // 햄버거 체크 박스 체크 표시X
        Checkbox cbx6=new Checkbox("햄버거",group,false);
        // 패널에 생성
        p.add(cbx4);
        p.add(cbx5);
        p.add(cbx6);
 
        add(p);
        // 윈도우 사이즈 180 x 300
        setSize(180, 300);
        // 윈도우 
        setVisible(true);
    }
}
