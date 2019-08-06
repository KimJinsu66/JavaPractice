package GUI;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest extends Frame
{
    public PanelTest(String str)
    {
        super(str); //str은 frame 이름
        Panel panel1 = new Panel();
        // 색을 빨강으로 지정
        panel1.setBackground(Color.RED);
        // Frame에 추가
        add(panel1);
        // 크기
        setSize(300,300);
        setVisible(true);
    } 
}
