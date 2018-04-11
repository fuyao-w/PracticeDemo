package wang.util.java;

import java.util.Calendar;

public class CalenderDemod {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
          String mounth[]={"january","feb","mar"};
          
          Calendar s=Calendar.getInstance();
          System.out.println("Date : "+mounth[s.get(Calendar.MONTH)]+" "+s.get(Calendar.DATE)+" "+s.get(Calendar.YEAR)); 
          
          
          System.out.println(s.get(Calendar.HOUR));
          s.set(s.HOUR,10);
          System.out.println(s.get(Calendar.HOUR));
	}

}
