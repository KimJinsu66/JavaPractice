package GUI;

import java.awt.Frame;

public class FrameTest1 {

	public static void main(String[] args) {
		Frame f= new Frame();
        f.setTitle("첫 번째 프레임 입니다.");
        f.setBounds(100, 100, 300, 300);
        f.setVisible(true); // false로 할시 보이지 않는다.
	}

}
