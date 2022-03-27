package strategy3.modularization;

public class TestMain {
	public static void main(String[] args) {
		Student st1 = new Student("30301", "���л�", "�����ڹ�");
		Student st2 = new Student("30302", "������", "�ڹٴܱ�");
		Lecturer l1 = new Lecturer("J01", "ȫ����", "������");
		Lecturer l2 = new Lecturer("J02", "�����", "�����α׷���");
		Staff s1  = new Staff("A01", "������", "����");
		Person[] person = {st1, st2, l1, l2, s1};
		for(Person p : person)
			p.job();
		System.out.println("�� �� �� ������ �� ������ �� ���� �� �� ��");
		for(Person p : person)
			p.get();
		System.out.println("�� �� �� �ñ��ϸ� ����Ʈ �� �� ��");
		for(Person p : person)
			System.out.println(p);
//			p.print();
			
	}
}
