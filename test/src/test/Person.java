package test;
//������ �ȿ� �ִ� ��� 
public class Person {

	String name;
	int age;

	public Person(){
		this.name = "�̸����� ���";
		this.age= 5500;
	}
	//�⺻ �������̱� ������ private�� �ᵵ ������ �����ϴ�.
	public Person(String name, int age){
		this.name = name;
		this.age=age;
		
	}
	public Person(int age){
		this.name= "�̸����� ���";
		this.age= age;
		
	}
	public String toString(){
		return name + "("+ age+")";
	}
	//toString�Լ��� ��ü�� ����Ҷ� ��µǴ� �Լ��̴�.
}
