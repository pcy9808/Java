package test1;

public class SonCar implements Car {
//implements 역시 상속이지만 interface만 상속할 수 있다.
//implements 는 부모가 부족해서 다시 재정의 해주어야 한다
	public void maxSpeed() {
		System.out.println( "시속 4000km");

	}
}
