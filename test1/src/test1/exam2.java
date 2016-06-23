package test1;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		int sum=0;
		Scanner s = new Scanner(System.in);
		int i=s.nextInt();
		
		
			for(int j=1;j<i;j++){
				if(i%j==0) {   	sum+=j;}
			}
		
		if(sum==i){
			System.out.println(i);
			System.out.println("¿ÏÀü¼ö¿°");
		}else{
			System.out.println("¿ÏÀü¼ö ¾Æ´Ï¿°");
		}
		

	}

}
