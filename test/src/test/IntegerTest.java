package test;

public class IntegerTest {

	public static void main(String[] args) {
		byte b1=Byte.MAX_VALUE;
		byte b2=Byte.MIN_VALUE;
		
		short s1=Short.MAX_VALUE;
		short s2=Short.MIN_VALUE;
		
		int i1=Integer.MAX_VALUE;
		int i2=Integer.MIN_VALUE;
		
		long l1=Long.MAX_VALUE;
		Long l2=Long.MIN_VALUE;
		
		System.out.println("byte�� ������ : "+ b2+ "~" +b1);
		System.out.println("short�� ������ : "+ s2+ "~" +s1);
		System.out.println("int�� ������ : "+ i2+ "~" +i1);
		System.out.println("long�� ������ : "+ l2+ "~" +l1);
	}

}
