package GUI;
//https://brian-s.tistory.com/98 사이트 참조

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

class FrameTest extends JFrame{
	public FrameTest(){
		// 이 코드는 컨테이너가 실행되는 위치를 지정한다.
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize(); //이 2줄이 조금 이해가 안된다.
		this.setLocation(screenSize.width /2, screenSize.height /3);
		// 화면 폭의 1/3 지점, 높이의 1/2 지점에 시작포인트를 맞춘다
		// 기본 틀의 시작점을 지정할 때 사용하는 코드들 
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		// FlowLayout은 말 그대로 흐름대로 배친된다는 내용이다.
		// 추가적인 옵션이 없다면 왼쪽에서 오른쪼긍로 위에서 아래로 흐르듯이 배치된다
		setLayout(new FlowLayout());
		
		
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		
		this.add(button1); // this는 JFrame을 이야기 한다
		this.add(button2); // 즉 컨테이너에 컴포넌트를 추가시킨다.
		this.add(button3); // this 생략 가능 강조하는 의미로 사용
		
		this.setVisible(true);
		this.setResizable(true);// 컨테이너 크기를 자유자재로 조작 할 수 있게 해준다
	}

}

public class MyFrame {
	
	public static void main(String[] args){
		FrameTest f = new FrameTest();
		
	}
	}

