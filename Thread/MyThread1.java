package Thread;
// Thread 클래스를 상속받는다.
// Thread가 가지고 있는 run() 메소드를 오버라이딩 한다.
// 10번 반복하면서 str을 찍는다.
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
			//컴퓨터가 너무 빠, 90-78776887j르기 때문에 수행결과를 잘 확인 할 수 없어서 Thread.sleep()메서드 사용
			// 조금씩 쉬었다가 출력할 수 있게 한다.
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
