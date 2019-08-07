package GUI;
//https://brian-s.tistory.com/98 ����Ʈ ����

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

class FrameTest extends JFrame{
	public FrameTest(){
		// �� �ڵ�� �����̳ʰ� ����Ǵ� ��ġ�� �����Ѵ�.
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize(); //�� 2���� ���� ���ذ� �ȵȴ�.
		this.setLocation(screenSize.width /2, screenSize.height /3);
		// ȭ�� ���� 1/3 ����, ������ 1/2 ������ ��������Ʈ�� �����
		// �⺻ Ʋ�� �������� ������ �� ����ϴ� �ڵ�� 
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		// FlowLayout�� �� �״�� �帧��� ��ģ�ȴٴ� �����̴�.
		// �߰����� �ɼ��� ���ٸ� ���ʿ��� �����ɱ�� ������ �Ʒ��� �帣���� ��ġ�ȴ�
		setLayout(new FlowLayout());
		
		
		JButton button1 = new JButton("��ư1");
		JButton button2 = new JButton("��ư2");
		JButton button3 = new JButton("��ư3");
		
		this.add(button1); // this�� JFrame�� �̾߱� �Ѵ�
		this.add(button2); // �� �����̳ʿ� ������Ʈ�� �߰���Ų��.
		this.add(button3); // this ���� ���� �����ϴ� �ǹ̷� ���
		
		this.setVisible(true);
		this.setResizable(true);// �����̳� ũ�⸦ ��������� ���� �� �� �ְ� ���ش�
	}

}

public class MyFrame {
	
	public static void main(String[] args){
		FrameTest f = new FrameTest();
		
	}
	}

