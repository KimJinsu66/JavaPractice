package GUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTable_1 extends JPanel {

	public JTable_1(){
		String title[] = {"번호","이름","나이"};
		String data[][]={
				{"1","김철수","26"},
				{"2","김민수","25"},
				{"3","최자바","24"}
				
		};
		//테이블 생성
		JTable table = new JTable(data,title);
		JScrollPane sp = new JScrollPane(table);
		add(sp);
	}
}
