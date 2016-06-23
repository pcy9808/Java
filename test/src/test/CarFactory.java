package test;

public class CarFactory {
	static int serialnumber=0;
	String model;
	String color;
	int mySerialNumber;
	//맴버변수 선언
	 
	public CarFactory(String model, String color){
		this.model = model;
		this.color = color;
		this.mySerialNumber = ++serialnumber;
		//serialnumber는 static이기 때문에 매개변수에 써주지 않아도 공유가 된다 지금 이것은 증가식을 써준것
		
	}
	public String toString(){
		return "차 기종 : "+model+"("+color+"SerialNumbeer: AA131238"+mySerialNumber+")";
		//괄호를 치면 연산이 된다
	}
	
	
	
}
