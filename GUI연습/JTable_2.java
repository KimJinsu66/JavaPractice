package GUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTable_2 extends JPanel {
	public JTable_2(){
	String title[] = {"��ȣ","����","�Ҽ�"};
	String data[][]={
			{"1","�౸����","����FC"},
			{"2","������","�۷ι�����Ʈ�����а�"},
			{"3","�����̳�","MS"}
			
	};
	//���̺� ����
	JTable table = new JTable(data,title);
	JScrollPane sp = new JScrollPane(table);
	add(sp);
}
}