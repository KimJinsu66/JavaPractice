package Thread;

public class Bus extends Car implements Runnable {
	String str;
	public Bus(String str){
		this.str =str;
		
	}
	@Override
	public void run() {
		for(int i=0 ; i <5; i++){
			System.out.println(str);
			try{
				Thread.sleep(1000);;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	

}
