package Thread;
// Thread Ŭ������ ��ӹ޴´�.
// Thread�� ������ �ִ� run() �޼ҵ带 �������̵� �Ѵ�.
// 10�� �ݺ��ϸ鼭 str�� ��´�.
public class MyThread1 extends Thread {
	String str;
	public MyThread1(String str){
		this.str =str;
		
	}
	public void run(){
		for(int i = 0; i <10; i ++){
			System.out.println(str);
		}
		try{
			//��ǻ�Ͱ� �ʹ� ��, 90-78776887j���� ������ �������� �� Ȯ�� �� �� ��� Thread.sleep()�޼��� ���
			// ���ݾ� �����ٰ� ����� �� �ְ� �Ѵ�.
			Thread.sleep((int)(Math.random() * 10000));
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		
		t1.start();
		t2.start();
		System.out.println("!!!!!");
	}

}
