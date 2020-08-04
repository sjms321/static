package day15.ch01_static;
/*
 * <static>
 * -�������, ����Լ� �տ� ���� �� �ִ�. 
 * -1) ������ ���������. =>new���̵� ��밡��. Ŭ���� �ε�(�ε�)�� �̸� ������
 *  2) 1���� ���������.=> ��ü�� 100�� ���� static ��������� 1����
 *						 ��� ��ü�� �����ϴ°���
 *	3) Ŭ���� ������ �����Ѵ�.
 *		a.name
 *		person.name
 *-�뵵 
 *	=> new ���ص� ����� �� �ִٸ� (new �ϱ� �����ٸ�..)
 * 	=> static �޼����� ���,
 * 		�޼��� ���뿡 non-static ����� ������ �ʴ´ٸ�
 * 	=> 1���� �����ؾ� �ϴ� ���  example)destination
 * 
 * - ����� ���� ����� public static final�� ��� ���δ�.
 * 		public : ��ο��� �����ְڴ�.
 * 		static : 1���� ����ڴ�
 * 		final  : ������ ����
 */

class StaticTest{
	String insStr="���� �ν��Ͻ� ���!";
	//non-static ��� : �ν��Ͻ� ��� (�ν��Ͻ� ������, �� new �� ���� �����Ǳ� ������)
	static String sttStr = "���� Ŭ���� ���~";
	// static ���: Ŭ���� ��� (Ŭ���� �ε�� �����Ǳ� ������)
	void insMethod() {
		//�ν��Ͻ� ����޼���� static, non static ������� ��� ���ٰ���
		System.out.println(insStr); 
		System.out.println(sttStr);
		System.out.println("���� �ν��Ͻ� ��� insMethod!");
	}
	static void sttMethod() {
		//static �޼���� static ����� ���� ����
		//System.out.println(insStr); //����! -> ���������� ���� ���� Ŭ���� �о߰� ���� �����̵ǰ� static�� Ŭ���� �о߿��ֱ� ������ non-static������ ����ƽ �޼ҵ忡�� ���� ����
		//                                   ==> static����� non-static ���� ���� ���� �Ǿ�� �ؼ� �����¾�� ���� non-static�� ��� �Ұ���.
		System.out.println(sttStr);
		System.out.println("���� �ν��Ͻ� ��� sttMethod!");
	}
}
public class Test01 {
	public static void main(String[] args) {
		System.out.println(StaticTest.sttStr);
		
		StaticTest st = new StaticTest();
		//System.out.println(StaticTest.insStr); ����!
		System.out.println(st.insStr);//non - static �� �ݵ�� ��üȭ �ؾ� ��
		System.out.println(st.sttStr);//static�� ��ü�� ���ؼ��� ���� ����
		
		StaticTest.sttMethod();//����
	//	StaticTest.insMethod(); //�Ұ���!
		
		st.sttMethod(); //����!
		st.insMethod(); //����!
		
	}
}
