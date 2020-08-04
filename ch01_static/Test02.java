package day15.ch01_static;
class Tourist{
	String name;
	int budget;
	static String destination;
	
	Tourist(String name, int budgget){
		this.budget = budgget;
		this.name = name;
		
	}
	
	void printInfo(){
		System.out.println("이름 : "+name);
		System.out.println("예산 : "+budget);
		System.out.println("목적지 : "+destination);
	}
}
public class Test02 {
	public static void main(String[] args) {
		//모든 여행객의 목적지는 동일하다.
		Tourist t1 = new Tourist("이푸린", 100000);
		Tourist t2 = new Tourist("김피카츄", 150000);
		Tourist t3 = new Tourist("장이상해씨", 200000);

//     **destination이 static이 아니라면, 모든 객체들에게 일일히 값 저장을 해야함		
//		t1.destination = "제주도";
//		t2.destination = "제주도";
//		t3.destination = "제주도";
		
	  //**destination이 static이라면 한큐에 해결!
		Tourist.destination = "제주도"; 
		t1.printInfo();
		t2.printInfo();
		t3.printInfo();
	}
}
