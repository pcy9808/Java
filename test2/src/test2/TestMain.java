package test2;

public class TestMain {

	public static void main(String[] args) {
		//1. 선언타입이 Object일 때..
		Object o11 = new Object();
//		Object o12 = new InterA();
//		Object o13 = new InterB();
//		Object o14 = new InterC();
//Inter A,B,C는 모두 인터페이스 이기 때문에 생성 되지 않음 
		Object o15 = new ClassA();
		Object o16 = new ClassB();
//		Object o17 = new AbstractClassA();
//AbstractClassA()는 abstract도 추상 이기 때문에 사용 불가
		
		
		//2. 선언타입이 InterA일 때..
//		InterA o21 = new Object();
//		InterA o22 = new InterA();
//		InterA o23 = new InterB();
//		InterA o24 = new InterC();
//Inter A,B,C는 모두 인터페이스 이기 때문에 생성 되지 않음 
		InterA o25 = new ClassA();
		InterA o26 = new ClassB();
//		InterA o27 = new AbstractClassA();
//AbstractClassA()는 abstract도 추상 이기 때문에 사용 불가
		
		
		//3. 선언타입이 InterB일 때...
//		InterB o31 = new Object();
//		InterB o32 = new InterA();
//		InterB o33 = new InterB();
//		InterB o34 = new InterC();
//Inter A,B,C는 모두 인터페이스 이기 때문에 생성 되지 않음 
		InterB o35 = new ClassA();
		InterB o36 = new ClassB();
//		InterB o37 = new AbstractClassA();
		
		
		//4. 선언타입이 InterC일 때..
//		InterC o41 = new Object();
//		InterC o42 = new InterA();
//		InterC o43 = new InterB();
//		InterC o44 = new InterC();
//		InterC o45 = new ClassA();
//InterC는 ClassA에 상속자 AbstractClassA상속에 포함이 안되서 되지 않는다.		
		InterC o46 = new ClassB();
//		InterC o47 = new AbstractClassA();
		
		
		//5. 선언타입이 ClassA일 때..
//		ClassA o51 = new Object();
//		ClassA o52 = new InterA();
//		ClassA o53 = new InterB();
//		ClassA o54 = new InterC();
		ClassA o55 = new ClassA();
//		ClassA o56 = new ClassB();
//		ClassA o57 = new AbstractClassA();
//
		
		//6. 선언타입이 ClassB일 때..
//		ClassB o61 = new Object();
//		ClassB o62 = new InterA();
//		ClassB o63 = new InterB();
//		ClassB o64 = new InterC();
//		ClassB o65 = new ClassA();
		ClassB o66 = new ClassB();
//		ClassB o67 = new AbstractClassA();
		
		//7. 선언타입이 AbstractClassA일 때..
//		AbstractClassA o71 = new Object();
//		AbstractClassA o72 = new InterA();
//		AbstractClassA o73 = new InterB();
//		AbstractClassA o74 = new InterC();
		AbstractClassA o75 = new ClassA();
//		AbstractClassA o76 = new ClassB();
//		AbstractClassA o77 = new AbstractClassA();
		
		

		

	}

}
