package test;

public class CarFactory {
	static int serialnumber=0;
	String model;
	String color;
	int mySerialNumber;
	//�ɹ����� ����
	 
	public CarFactory(String model, String color){
		this.model = model;
		this.color = color;
		this.mySerialNumber = ++serialnumber;
		//serialnumber�� static�̱� ������ �Ű������� ������ �ʾƵ� ������ �ȴ� ���� �̰��� �������� ���ذ�
		
	}
	public String toString(){
		return "�� ���� : "+model+"("+color+"SerialNumbeer: AA131238"+mySerialNumber+")";
		//��ȣ�� ġ�� ������ �ȴ�
	}
	
	
	
}
