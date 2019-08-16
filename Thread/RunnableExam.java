package Thread;

public class RunnableExam {

	public static void main(String[] args) {
		Bus bus = new Bus("버스가 달립니다.");
		Bus bus2 = new Bus("버스2가 달립니다.");
	    
		/*
	        Runnable을 구현한 클래스를 이용해 쓰레드를 이용할때는
	        아래와 같이 Thread의 생성자에 해당 객체(bus)를 전달하면 됩니다.
	        하지만 이대로 실행하면 에러가 발생합니다.
	        bus가 runnable을 implements하고 있지 않기 때문입니다.
	        */
	        Thread busThread = new Thread(bus);
	        Thread busThread2 = new Thread(bus2);
	        
	        busThread.start();
	        busThread2.start();
	        
	        System.out.println("main End");
	    }
}
//https://programmers.co.kr/learn/courses/9/lessons/273