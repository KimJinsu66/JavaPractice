package Thread;

public class RunnableExam {

	public static void main(String[] args) {
		Bus bus = new Bus("������ �޸��ϴ�.");
		Bus bus2 = new Bus("����2�� �޸��ϴ�.");
	    
		/*
	        Runnable�� ������ Ŭ������ �̿��� �����带 �̿��Ҷ���
	        �Ʒ��� ���� Thread�� �����ڿ� �ش� ��ü(bus)�� �����ϸ� �˴ϴ�.
	        ������ �̴�� �����ϸ� ������ �߻��մϴ�.
	        bus�� runnable�� implements�ϰ� ���� �ʱ� �����Դϴ�.
	        */
	        Thread busThread = new Thread(bus);
	        Thread busThread2 = new Thread(bus2);
	        
	        busThread.start();
	        busThread2.start();
	        
	        System.out.println("main End");
	    }
}
//https://programmers.co.kr/learn/courses/9/lessons/273