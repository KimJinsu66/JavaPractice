package GUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTable_2 extends JPanel {
	public JTable_2(){
	String title[] = {"번호","직업","소속"};
	String data[][]={
			{"1","축구선수","성남FC"},
			{"2","김진수","글로벌소프트웨어학과"},
			{"3","디자이너","MS"}
			
	};
	//테이블 생성
	JTable table = new JTable(data,title);
	JScrollPane sp = new JScrollPane(table);
	add(sp);
}
}