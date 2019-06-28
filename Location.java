package Number7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Location {
	private String city;
	private int latitude;
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	private int longitude;
	public Location(String city, int latitude, int longitude ) {
		this.city = city;
		this.latitude = latitude;
		this.longitude = longitude;
		
	}
	public Location(int latitude, int longitude ) {
		this.latitude = latitude;
		this.longitude = longitude;
		
	}
	public static void main(String[] args) {
		HashMap<String,Location> hash = new HashMap<String,Location>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("도시,경도,위도를 입력하세요.");
		
		for (int i  =0; i < 1 ; i ++) {
			System.out.print(i+1 + "번째 ㅡㅡ");
			String city = sc.next();
			int latitude = sc.nextInt();
			int longitude = sc.nextInt();
			
			hash.put(city, new Location(latitude,longitude));
		}//for 종
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡ");
		//hashmap 반복하는 방
		Set<String> keys = hash.keySet();// 해쉬맵 h에 있는 모든 키를 Set컬렉션으로 리
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Location lo = hash.get(key);
			System.out.println(key +","+ lo.getLatitude() +","+ lo.getLongitude());
			
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡ");
		while(true) {
			System.out.print("도시이름 >>");
			String city = sc.next();
			if(city.equals("stop")) {break;}
			try{
			Location lo = hash.get(city);
			System.out.println(city +","+ lo.getLatitude() +","+ lo.getLongitude());
			}
			catch(NullPointerException e){
				System.out.println(city + "는 없습니다");	
			}
			
			
		}
	}

}
