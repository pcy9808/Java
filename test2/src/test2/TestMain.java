package test2;

public class TestMain {

	public static void main(String[] args) {
		//1. ����Ÿ���� Object�� ��..
		Object o11 = new Object();
//		Object o12 = new InterA();
//		Object o13 = new InterB();
//		Object o14 = new InterC();
//Inter A,B,C�� ��� �������̽� �̱� ������ ���� ���� ���� 
		Object o15 = new ClassA();
		Object o16 = new ClassB();
//		Object o17 = new AbstractClassA();
//AbstractClassA()�� abstract�� �߻� �̱� ������ ��� �Ұ�
		
		
		//2. ����Ÿ���� InterA�� ��..
//		InterA o21 = new Object();
//		InterA o22 = new InterA();
//		InterA o23 = new InterB();
//		InterA o24 = new InterC();
//Inter A,B,C�� ��� �������̽� �̱� ������ ���� ���� ���� 
		InterA o25 = new ClassA();
		InterA o26 = new ClassB();
//		InterA o27 = new AbstractClassA();
//AbstractClassA()�� abstract�� �߻� �̱� ������ ��� �Ұ�
		
		
		//3. ����Ÿ���� InterB�� ��...
//		InterB o31 = new Object();
//		InterB o32 = new InterA();
//		InterB o33 = new InterB();
//		InterB o34 = new InterC();
//Inter A,B,C�� ��� �������̽� �̱� ������ ���� ���� ���� 
		InterB o35 = new ClassA();
		InterB o36 = new ClassB();
//		InterB o37 = new AbstractClassA();
		
		
		//4. ����Ÿ���� InterC�� ��..
//		InterC o41 = new Object();
//		InterC o42 = new InterA();
//		InterC o43 = new InterB();
//		InterC o44 = new InterC();
//		InterC o45 = new ClassA();
//InterC�� ClassA�� ����� AbstractClassA��ӿ� ������ �ȵǼ� ���� �ʴ´�.		
		InterC o46 = new ClassB();
//		InterC o47 = new AbstractClassA();
		
		
		//5. ����Ÿ���� ClassA�� ��..
//		ClassA o51 = new Object();
//		ClassA o52 = new InterA();
//		ClassA o53 = new InterB();
//		ClassA o54 = new InterC();
		ClassA o55 = new ClassA();
//		ClassA o56 = new ClassB();
//		ClassA o57 = new AbstractClassA();
//
		
		//6. ����Ÿ���� ClassB�� ��..
//		ClassB o61 = new Object();
//		ClassB o62 = new InterA();
//		ClassB o63 = new InterB();
//		ClassB o64 = new InterC();
//		ClassB o65 = new ClassA();
		ClassB o66 = new ClassB();
//		ClassB o67 = new AbstractClassA();
		
		//7. ����Ÿ���� AbstractClassA�� ��..
//		AbstractClassA o71 = new Object();
//		AbstractClassA o72 = new InterA();
//		AbstractClassA o73 = new InterB();
//		AbstractClassA o74 = new InterC();
		AbstractClassA o75 = new ClassA();
//		AbstractClassA o76 = new ClassB();
//		AbstractClassA o77 = new AbstractClassA();
		
		

		

	}

}
