package �ܿ�9;

import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.xml.parsers.DocumentBuilder;

public class FlowLayout extends JFrame {
	
	private Panel controlPanel;
	private Panel text_pn;
	Cal cal = new Cal(); // Cal class���� �޾ƿ´�.
	private TextField textfield_3;
	private TextField textfield_4;
	private Label textfield_result;
	
	private JButton plus_bt1;
	private JButton minus_bt;
	private JButton mul_bt;
	private JButton div_bt;
	//��ư �߰�
	private void addButton(){
		
		plus_bt1 = new JButton("+");
		minus_bt = new JButton("-");
		mul_bt = new JButton("*");
		div_bt = new JButton("/");
		
		plus_bt1.addActionListener(new EventHandler());
		minus_bt.addActionListener(new EventHandler());
		mul_bt.addActionListener(new EventHandler());
		div_bt.addActionListener(new EventHandler());
		
		controlPanel.add(plus_bt1);
		controlPanel.add(minus_bt);
		controlPanel.add(mul_bt);
		controlPanel.add(div_bt);
			
	}
	// �ؽ�Ʈ �ʵ� �߰�
	private void addTextfield(){
		textfield_3 = new TextField();
		textfield_4 = new TextField();
		textfield_result = new Label();
		text_pn.add(textfield_3);
		text_pn.add(textfield_4);
		text_pn.add(textfield_result);
	}
	
	private int Int_Change(TextField text){
		String t1 = text.getText().trim();
		
		int num1 = Integer.parseInt(t1);
		return num1;
	}
	private String String_Change(int num){
		String number = Integer.toString(num);	
		
		return number;
	}
	
	class EventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int cal_result = 0;
			if(e.getSource() == plus_bt1){
				cal_result = cal.sum(Int_Change(textfield_3), Int_Change(textfield_4));
				textfield_result.setText(String_Change(cal_result));
			}
			else if (e.getSource() == minus_bt){
				cal_result = cal.min(Int_Change(textfield_3), Int_Change(textfield_4));
				textfield_result.setText(String_Change(cal_result));
				System.out.println(cal_result);
			}
			else if (e.getSource() == mul_bt){
				cal_result = cal.mul(Int_Change(textfield_3), Int_Change(textfield_4));
				textfield_result.setText(String_Change(cal_result));
				
			}
			else if (e.getSource() == div_bt){
				
				double dou_cal_result = cal.div(Int_Change(textfield_3), Int_Change(textfield_4));
				
				textfield_result.setText(Double.toString(dou_cal_result));
				
				
			}
		
		}
		
	}
	// Main Frame
	public FlowLayout(){
		setTitle("300 x 300 ����");
		//��ü���� �ĳ� 
		Panel jp = new Panel();
		jp.setLayout(new java.awt.FlowLayout());
		// ���� ��ư �ĳ�
		controlPanel = new Panel();
		controlPanel.setLayout(new java.awt.FlowLayout());
		// �ؽ�Ʈ �Է� �� �ĳ�
		text_pn = new Panel();
		
		this.addTextfield();//�ؽ�Ʈ �ʵ� �߰� 
		this.addButton();// button �߰� 
		
		
		
		jp.add(text_pn);
		jp.add(controlPanel);
		this.add(jp);
		
		//this.clickButton();
		
		setSize(200, 200); // ������ ũ�� 300 x 300
		setVisible(true); //������ ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷��� �����ϵ��� ����
		
	}
	public static void main(String[] args) {
		
		FlowLayout fl = new FlowLayout();
		
	
	}

}
