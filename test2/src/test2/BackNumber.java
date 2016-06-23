package test2;

public class BackNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int i=0; i<10000;i++){
			String str=String.format("%04d",i);
			if(Integer.parseInt(str.substring(0,1))<Integer.parseInt(str.substring(1,2))&&Integer.parseInt(str.substring(1,2))<Integer.parseInt(str.substring(2,3))&&
					Integer.parseInt(str.substring(2,3))<Integer.parseInt(str.substring(3,4))){
				
				count++;
			}
			
		}
		System.out.println(count);
		
		

}
}
