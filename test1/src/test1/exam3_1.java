package test1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class exam3_1 {
	
		public static void main(String[] args) {
		Calendar toDay= Calendar.getInstance();
		
		Date today = new Date();
		
		SimpleDateFormat sdf0;
		sdf0=new SimpleDateFormat("yyyyMMdd");
		
		Scanner s = new Scanner(System.in);
		int i=s.nextInt();
	
		long time=Integer.parseInt(sdf0.format(today));
		
		
		System.out.println(time);
		
		long diffSec=time-i;
		long diffDay=diffSec/(60*60*24);
		System.out.println(diffDay);
	}

	

	}

