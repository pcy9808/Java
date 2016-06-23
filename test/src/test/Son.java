package test;

public class Son extends Father {

	public Son() {
		System.out.println("아들 기본 생성자");
		
	}
	void printNickName(){//메소드
		System.out.println("존나 쌔끈 최신 닉네임 아들");
		//오버라이딩 overriding == 상속의 경우에만 사용되며 상속될 경우 상속 받는 아들이 선택됨
		//상속은 아들이 아버지를 가르친다 
}
	
}
