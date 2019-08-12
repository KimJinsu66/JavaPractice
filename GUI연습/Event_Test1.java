package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Event_Test1 extends JFrame{
	JTabbedPane tab;
	JTable_1 j1;
	JTable_2 j2;
	JTable_3 j3;
	JLabel lbl;
	JButton btn1, btn2;
	
	public Event_Test1(String str){
		
		super(str);
		tab = new JTabbedPane(JTabbedPane.TOP); // 탭생성과 위치 선정(가장위에)
		//패널 생성
		JPanel tap_panel1 = new JPanel();
		j1 = new JTable_1();
		JPanel tap_panel2 = new JPanel();
		j2 = new JTable_2();
		JPanel tap_panel3 = new JPanel();
		j3= new JTable_3();
		JPanel p3 = new JPanel();
		JButton b1 = new JButton("check");
		p3.add(b1);
		tap_panel1.add(j1);
		tap_panel2.add(j2);
		//tap_panel3.add(j3);

		tab.addTab("기본 데이터",tap_panel1);
		tab.addTab("정보 데이터",tap_panel2);
		tab.addTab("event 연습",j3);
		
		
		
		getContentPane().add(tab,BorderLayout.CENTER);
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		Event_Test1 jt = new Event_Test1("ActionEvent 테스트");
		jt.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

			
		
	


}

