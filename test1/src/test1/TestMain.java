package test1;

public class TestMain {
	public static void main(String[] args){
		String a = new String ("æ»≥Á«œººø‰.");
		String b = new String ("æ»≥Á«œººø‰.");
		
		String c= "æ»≥Á«œººø‰.";
		String d= "æ»≥Á«œººø‰.";
		
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(a==d);
		System.out.println(a.equals(b));
		System.out.println(args[0]);
		
		if(a.equals("æ»≥Á«œººø‰.")) {
			
		}
	}
	
}
