package GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JTable_3 extends JPanel implements ActionListener{
	JLabel lbl;
	JButton btn1,btn2;
	public JTable_3(){
		lbl = new JLabel("��ư�� �Է��ϼ���");
		
		Box ButtonBox = Box.createHorizontalBox();
		btn1 = new JButton("1��");
		btn2 = new JButton("2��");
		
		ButtonBox.add(btn1);
		ButtonBox.add(btn2);
		
		btn1.addActionListener(this);//this ?
		btn2.addActionListener(this);
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(ButtonBox);
		add("West",lbl);
	
	}//JTable_3() ������ ����
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if ((JButton)obj == btn1){
			lbl.setText("1��");
			
		}
		else if ((JButton)obj == btn2){
			lbl.setText("2��");
		
		}
	}// ActionPerformed ����
}// JFrame class ����
