package test;

public class StaticModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Statictest s1 = new Statictest();
		Statictest s2 = new Statictest();
		Statictest s3 = new Statictest();
		
		s1.a=1;
		s2.a=2;
		s3.a=3;
		
		Statictest.hohoho();//�޼ҵ忡�� hohoho�� ����� �־���.
		
		s1.hoho = 100;
		// ������ �����ν� ��� ���鿡�� ������ �Ǵ� ���̴�.
		System.out.println(s3.hoho);
		//s1�� �Է��� �ϸ� s1 s2 s3 ��δ� �� ���� �����Ѵ� ������ static���� ������ �Ͽ��� �����̴�.
		System.out.println(Statictest.hoho);
		//���� s1 s2 s3�Ӹ� �ƴ� class�� ������ �ϱ� ������ 100�� ��µǴ� ���̴�.
		
		// static�� ���� ������ �ϴ� ���̴�.
		
		
	}

}
