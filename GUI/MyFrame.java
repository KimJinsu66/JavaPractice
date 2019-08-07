package GUI;
//https://brian-s.tistory.com/98 ����Ʈ ����

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class FrameTest extends JFrame{
	public FrameTest(){
		// �� �ڵ�� �����̳ʰ� ����Ǵ� ��ġ�� �����Ѵ�.
		// ȭ�� ���� 1/3 ����, ������ 1/2 ������ ��������Ʈ�� �����
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize(); //�� 2���� ���� ���ذ� �ȵȴ�.
		this.setLocation(screenSize.width /2, screenSize.height /3);
		
		// �⺻ Ʋ�� �������� ������ �� ����ϴ� �ڵ�� 
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		// image ���� image ������Ʈ�� �ָ� �����ϰ� ��
		Image img = kit.getImage("and.png");
		this.setIconImage(img);
		
		// FlowLayout�� �� �״�� �帧��� ��ģ�ȴٴ� �����̴�.
		// �߰����� �ɼ��� ���ٸ� ���ʿ��� �����ɱ�� ������ �Ʒ��� �帣���� ��ġ�ȴ�
		//setLayout(new FlowLayout());
		// Panel �߰� ���ڶ�� �����ϸ� �ȴ�.
		JPanel panel = new JPanel();
		JLabel label = new JLabel("�ȳ��ϼ���");
		
		JButton button1 = new JButton("��ư1");
		JButton button2 = new JButton("��ư2");
		button2.setEnabled(false);// button ��� ���ϱ� �Ѵ�.
		
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		
		ImageIcon image = new ImageIcon("and.png");
		JLabel labelImage = new JLabel(image);
		panel.add(labelImage);
		JTextField t1 = new JTextField(10);// ��ȣ�ȿ� ũ�� ����
		JTextField t2 = new JTextField(10);
		int result = 3+ 4;
		String s_result = Integer.toString(result);
		t2.setText(s_result);
		t2.setEditable(false);
		panel.add(t1);
		panel.add(t2);
		this.add(panel); // this�� JFrame�� �̾߱� �Ѵ�
		// �� �����̳ʿ� ������Ʈ�� �߰���Ų��.
		// this ���� ���� �����ϴ� �ǹ̷� ���
		
		this.setVisible(true);
		this.setResizable(true);// �����̳� ũ�⸦ ��������� ���� �� �� �ְ� ���ش�
	}

}

public class MyFrame {
	
	public static void main(String[] args){
		FrameTest f = new FrameTest();
		
	}
	}

