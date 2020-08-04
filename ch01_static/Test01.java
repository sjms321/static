package day15.ch01_static;
/*
 * <static>
 * -멤버변수, 멤버함수 앞에 붙일 수 있다. 
 * -1) 무조건 만들어진다. =>new없이도 사용가능. 클래스 로드(로딩)에 미리 생성됨
 *  2) 1개만 만들어진다.=> 객체를 100개 만들어도 static 멤버변수는 1개뿐
 *						 모든 객체가 공유하는개념
 *	3) 클래스 명으로 접근한다.
 *		a.name
 *		person.name
 *-용도 
 *	=> new 안해도 사용하 수 있다면 (new 하기 귀찮다면..)
 * 	=> static 메서드의 경우,
 * 		메서드 내용에 non-static 멤버가 사용되지 않는다면
 * 	=> 1개만 생성해야 하는 경우  example)destination
 * 
 * - 사용자 정의 상수는 public static final를 모두 붙인다.
 * 		public : 모두에게 보여주겠다.
 * 		static : 1개만 만들겠다
 * 		final  : 값변경 ㄴㄴ
 */

class StaticTest{
	String insStr="나는 인스턴스 멤버!";
	//non-static 멤버 : 인스턴스 멤버 (인스턴스 생성시, 즉 new 할 ㄸㅐ 생성되기 때문에)
	static String sttStr = "나는 클래스 멤버~";
	// static 멤버: 클래스 멤버 (클래스 로드시 생성되기 때문에)
	void insMethod() {
		//인스턴스 멤버메서드는 static, non static 상관없이 모두 접근가능
		System.out.println(insStr); 
		System.out.println(sttStr);
		System.out.println("나는 인스턴스 멤버 insMethod!");
	}
	static void sttMethod() {
		//static 메서드는 static 멤버만 접근 가능
		//System.out.println(insStr); //에러! -> 생성시점에 의한 에러 클래스 분야가 먼저 생성이되고 static은 클래스 분야에있기 때문에 non-static변수가 스태틱 메소드에는 쓸수 없음
		//                                   ==> static멤버는 non-static 보다 먼저 생성 되어야 해서 아직태어나지 않은 non-static은 사용 불가능.
		System.out.println(sttStr);
		System.out.println("나는 인스턴스 멤버 sttMethod!");
	}
}
public class Test01 {
	public static void main(String[] args) {
		System.out.println(StaticTest.sttStr);
		
		StaticTest st = new StaticTest();
		//System.out.println(StaticTest.insStr); 에러!
		System.out.println(st.insStr);//non - static 은 반드시 객체화 해야 함
		System.out.println(st.sttStr);//static은 객체를 동해서도 접근 가능
		
		StaticTest.sttMethod();//가능
	//	StaticTest.insMethod(); //불가능!
		
		st.sttMethod(); //가능!
		st.insMethod(); //가능!
		
	}
}
