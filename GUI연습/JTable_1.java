package GUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTable_1 extends JPanel {

	public JTable_1(){
		String title[] = {"��ȣ","�̸�","����"};
		String data[][]={
				{"1","��ö��","26"},
				{"2","��μ�","25"},
				{"3","���ڹ�","24"}
				
		};
		//���̺� ����
		JTable table = new JTable(data,title);
		JScrollPane sp = new JScrollPane(table);
		add(sp);
	}
}
