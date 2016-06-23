package test1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class exam3 
{

	 public static void main(String[] args) throws Exception
	  {
				Calendar toDay= Calendar.getInstance();
				
				Date today = new Date();
				
				SimpleDateFormat sdf0;
				sdf0=new SimpleDateFormat("yyyyMMdd");
				Scanner s = new Scanner(System.in);
				String i= String.valueOf(s.nextInt());
							
				
				
		 
	    System.out.println(diffOfDate(sdf0.format(today), i));
	  }
	 
	  public static long diffOfDate(String begin, String end) throws Exception
	  {
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
	 
	    Date beginDate = formatter.parse(begin);
	    Date endDate = formatter.parse(end);
	 
	    long diff = beginDate.getTime() - endDate.getTime();
	    long diffDays = diff / (24 * 60 * 60 * 1000);
	 
	    return diffDays;
	  }

}
