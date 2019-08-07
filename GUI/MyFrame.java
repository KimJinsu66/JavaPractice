package GUI;
//https://brian-s.tistory.com/98 사이트 참조

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
		// 이 코드는 컨테이너가 실행되는 위치를 지정한다.
		// 화면 폭의 1/3 지점, 높이의 1/2 지점에 시작포인트를 맞춘다
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize(); //이 2줄이 조금 이해가 안된다.
		this.setLocation(screenSize.width /2, screenSize.height /3);
		
		// 기본 틀의 시작점을 지정할 때 사용하는 코드들 
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		// image 삽입 image 프로젝트에 넣면 간단하게 됨
		Image img = kit.getImage("and.png");
		this.setIconImage(img);
		
		// FlowLayout은 말 그대로 흐름대로 배친된다는 내용이다.
		// 추가적인 옵션이 없다면 왼쪽에서 오른쪼긍로 위에서 아래로 흐르듯이 배치된다
		//setLayout(new FlowLayout());
		// Panel 추가 액자라고 생각하면 된다.
		JPanel panel = new JPanel();
		JLabel label = new JLabel("안녕하세요");
		
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		button2.setEnabled(false);// button 사용 못하기 한다.
		
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		
		ImageIcon image = new ImageIcon("and.png");
		JLabel labelImage = new JLabel(image);
		panel.add(labelImage);
		JTextField t1 = new JTextField(10);// 괄호안에 크기 지정
		JTextField t2 = new JTextField(10);
		int result = 3+ 4;
		String s_result = Integer.toString(result);
		t2.setText(s_result);
		t2.setEditable(false);
		panel.add(t1);
		panel.add(t2);
		this.add(panel); // this는 JFrame을 이야기 한다
		// 즉 컨테이너에 컴포넌트를 추가시킨다.
		// this 생략 가능 강조하는 의미로 사용
		
		this.setVisible(true);
		this.setResizable(true);// 컨테이너 크기를 자유자재로 조작 할 수 있게 해준다
	}

}

public class MyFrame {
	
	public static void main(String[] args){
		FrameTest f = new FrameTest();
		
	}
	}

