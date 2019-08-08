package GUI;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Layout_Set extends JFrame {
	static String t1;
	static String t2;
	
	static int change_t1;
	static int change_t2;
	static JTextField text1;
	static JTextField text2;
	
	
	static JTextField text3;
	
	public Layout_Set(String title){
		
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(2,4,5,5));
		// 4 X 3 분할로 컴포넌트 배치 hGap = 5 , vGap 5가 된다.
		text1 = new JTextField(5);
		text2 = new JTextField(5);
		text3 = new JTextField(5);
		text3.enable(false);
		JLabel label = new JLabel("계산기");
		
		c.add(label);
		c.add(text1);
		c.add(text2);
		c.add(text3);
		//button 
		JButton p_button = new JButton("+");
		JButton b_button = new JButton("-");
		JButton m_button = new JButton("x");
		JButton d_button = new JButton("/");
		
		c.add(p_button);
		c.add(b_button);
		c.add(m_button);
		c.add(d_button);
		
		
		MyActionListener lister = new MyActionListener();
		p_button.addActionListener(lister);
		m_button.addActionListener(lister);
		d_button.addActionListener(lister);
		b_button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = change_t1 - change_t2;
				String change_result = Integer.toString(result);
				text3.setText(change_result);
				
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	class MyActionListener implements ActionListener {

		
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();//선택된 버튼을 알아낸다.
			t1 = text1.getText();
			t2 = text2.getText();
			change_t1 = Integer.parseInt(t1);
			change_t2 = Integer.parseInt(t2);
			
			if(b.getText().equals("+")){
				int result = change_t1 + change_t2;
				String change_result = Integer.toString(result);
				text3.setText(change_result);
			}
			else if (b.getText().equals("x")){
				int result = change_t1 * change_t2;
				String change_result = Integer.toString(result);
				text3.setText(change_result);
				
			}
			else if (b.getText().equals("/")){
				int result = change_t1 / change_t2;
				String change_result = Integer.toString(result);
				text3.setText(change_result);
				
				
			}
				
			}
		
	}

	public static void main(String[] args) {
		new Layout_Set("GridLayout");
	}

}
