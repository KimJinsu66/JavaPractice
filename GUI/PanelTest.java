package GUI;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest extends Frame
{
    public PanelTest(String str)
    {
        super(str); //str�� frame �̸�
        Panel panel1 = new Panel();
        // ���� �������� ����
        panel1.setBackground(Color.RED);
        // Frame�� �߰�
        add(panel1);
        // ũ��
        setSize(300,300);
        setVisible(true);
    } 
}
