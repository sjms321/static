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
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+budget);
		System.out.println("������ : "+destination);
	}
}
public class Test02 {
	public static void main(String[] args) {
		//��� ���ఴ�� �������� �����ϴ�.
		Tourist t1 = new Tourist("��Ǫ��", 100000);
		Tourist t2 = new Tourist("����ī��", 150000);
		Tourist t3 = new Tourist("���̻��ؾ�", 200000);

//     **destination�� static�� �ƴ϶��, ��� ��ü�鿡�� ������ �� ������ �ؾ���		
//		t1.destination = "���ֵ�";
//		t2.destination = "���ֵ�";
//		t3.destination = "���ֵ�";
		
	  //**destination�� static�̶�� ��ť�� �ذ�!
		Tourist.destination = "���ֵ�"; 
		t1.printInfo();
		t2.printInfo();
		t3.printInfo();
	}
}
