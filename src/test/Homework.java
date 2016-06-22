package test;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soccer[] s = new Soccer[2];
		s[0] = new Player();
		s[1] = new Player1();
		//s[2] = new Player2();
		
		for(Soccer cer: s ){
			System.out.println("================");
			cer.name();
			cer.height();
			cer.weight();
			cer.backNumber();
			System.out.println("================");

		}
		
		
		
	}

}
