package Thread;
//Runnable 인터페이스를 구현해서 쓰레드를 만드는 방법
// Runable 인터페이스가 가지고 있는 run()메소드를 구현한다.
// Thread 두번째 방법
public class MyThread2 implements Runnable {
	String str;
    public MyThread2(String str){
        this.str = str;
    }

    public void run(){
        for(int i = 0; i < 10; i ++){
            System.out.print(str);
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }
    public static void main(String[] args){
    	MyThread2 r1 = new MyThread2("*");
        MyThread2 r2 = new MyThread2("-");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        System.out.print("!!!!!");  
    	 
    }
}
