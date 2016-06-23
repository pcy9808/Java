package test;

public class TestCarFactory {

	public static void main(String[] args) {
//	CarFactory sonata = new CarFactory("소나타","블랙");
//	CarFactory abvante = new CarFactory("아반테","레드");
//	CarFactory grandeur = new CarFactory("그렌져","화이트");
//	//마지막은 매개변수를 써주지 않는다 스태틱이기 때문에(증가되었음)
//	System.out.println(sonata);
//	System.out.println(abvante);
//	System.out.println(grandeur);
		
	//객체 배열
	CarFactory[] car = new CarFactory[5];
	car[0]=new CarFactory("소나타","블랙");
	car[1]=new CarFactory("그랜저","흰색");
	car[2]=new CarFactory("아반테","빨간");
	car[3]=new CarFactory("말리부","노란");
	car[4]=new CarFactory("클루즈","파란");
	
	for(CarFactory yang : car){
		System.out.println(yang);
	}

	}

}
