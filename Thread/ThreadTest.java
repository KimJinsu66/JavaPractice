package Thread;

import java.util.Random;

//스레드를 사용하면 단순 박복의 코드를 실행할 때도 여러개의 쓰레드를 만들어서 분리시킨뒤 결과 데이터를
//받아 합치면 그만큼 시간을 절약할 수 있습니다.
public class ThreadTest extends Thread {
	// index 변수를 추가해서 스레드가 동작시에 해당 변수를 증가시키도록 한다.
	private static int index = 0;
	private int id = -1;
	public ThreadTest(int id){
		this.id = id;
	}// 쓰레드 만들어서 구동하느 것중 대표적인 것은 Thread 클래스 상속받는 것이다.
	
	public void run(){
		System.out.println(id + "번 쓰레드 동작 중...");
		Random r = new Random(System.currentTimeMillis());
		try{
			long s = r.nextInt(3000);// 3초내로 끝낸다.
			Thread.sleep(s);; //쓰레드를 잠시 멈춤
			index++;
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		System.out.println(id + "번 쓰레드 동작종료...");
		
	}
	public static void main(String[] args) {
		System.out.println("Start main method.");

		for(int i = 0; i< 10; i++){
			ThreadTest test = new ThreadTest(i);
			test.start();// 이 메도드를 실행하면 Thread 내의 run()을 수행한다.
		}
		System.out.println("current Index: "+ index );
		System.out.println("End main method.");
	}

}
