package test1;

public class TestMain {
	public static void main(String[] args){
		String a = new String ("�ȳ��ϼ���.");
		String b = new String ("�ȳ��ϼ���.");
		
		String c= "�ȳ��ϼ���.";
		String d= "�ȳ��ϼ���.";
		
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(a==d);
		System.out.println(a.equals(b));
		System.out.println(args[0]);
		
		if(a.equals("�ȳ��ϼ���.")) {
			
		}
	}
	
}
