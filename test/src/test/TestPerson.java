package test;

public class TestPerson {

	public static void main(String[] args) {
		Person Ahn =new Person();
		//reference variable
		
		System.out.println(Ahn);
		//Person.java ���� public person �̶�� �޼ҵ忡�� ���� �ʱ�ȭ�� �� �� �ִ�.
		
		Ahn.name="��ȣ";
		Ahn.age=18;
		System.out.println(Ahn);
		//Ahn�� �ּҰ��� toString���� ���� ��¥ �ּҰ��� �ƴ� �ٲ㼭 ����� �Ͽ���.
		
		Person Won = new Person("ġ��",19);
		System.out.println(Won);
		//������ (Person.java)���� ���� ������ ���־��⿡ (�Ű������� ����) ����� ���ÿ� ����� ������ ���°� �ȴ�.
		
		Person Jang = new Person();
		Jang.name = "â��";
		Jang.age=18;
		System.out.println(Jang);
	}

}
