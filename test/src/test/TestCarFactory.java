package test;

public class TestCarFactory {

	public static void main(String[] args) {
//	CarFactory sonata = new CarFactory("�ҳ�Ÿ","��");
//	CarFactory abvante = new CarFactory("�ƹ���","����");
//	CarFactory grandeur = new CarFactory("�׷���","ȭ��Ʈ");
//	//�������� �Ű������� ������ �ʴ´� ����ƽ�̱� ������(�����Ǿ���)
//	System.out.println(sonata);
//	System.out.println(abvante);
//	System.out.println(grandeur);
		
	//��ü �迭
	CarFactory[] car = new CarFactory[5];
	car[0]=new CarFactory("�ҳ�Ÿ","��");
	car[1]=new CarFactory("�׷���","���");
	car[2]=new CarFactory("�ƹ���","����");
	car[3]=new CarFactory("������","���");
	car[4]=new CarFactory("Ŭ����","�Ķ�");
	
	for(CarFactory yang : car){
		System.out.println(yang);
	}

	}

}
