package Thread;

import java.util.Random;

//�����带 ����ϸ� �ܼ� �ں��� �ڵ带 ������ ���� �������� �����带 ���� �и���Ų�� ��� �����͸�
//�޾� ��ġ�� �׸�ŭ �ð��� ������ �� �ֽ��ϴ�.
public class ThreadTest extends Thread {
	// index ������ �߰��ؼ� �����尡 ���۽ÿ� �ش� ������ ������Ű���� �Ѵ�.
	private static int index = 0;
	private int id = -1;
	public ThreadTest(int id){
		this.id = id;
	}// ������ ���� �����ϴ� ���� ��ǥ���� ���� Thread Ŭ���� ��ӹ޴� ���̴�.
	
	public void run(){
		System.out.println(id + "�� ������ ���� ��...");
		Random r = new Random(System.currentTimeMillis());
		try{
			long s = r.nextInt(3000);// 3�ʳ��� ������.
			Thread.sleep(s);; //�����带 ��� ����
			index++;
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		System.out.println(id + "�� ������ ��������...");
		
	}
	public static void main(String[] args) {
		System.out.println("Start main method.");

		for(int i = 0; i< 10; i++){
			ThreadTest test = new ThreadTest(i);
			test.start();// �� �޵��带 �����ϸ� Thread ���� run()�� �����Ѵ�.
		}
		System.out.println("current Index: "+ index );
		System.out.println("End main method.");
	}

}
