package wang.util.java;
import java.util.*;
public class GregorianCalendarDemo {
public static void main(String[] args) {
	

	String mounths[]={"Jan","Feb","Mar","Apr"};
	int year;
	GregorianCalendar s=new GregorianCalendar();
    System.out.println(mounths[s.get(Calendar.MONTH)]);

    if(s.isLeapYear(2017)){
    	System.out.println("闰年");
    }else
    	System.out.println("不是闰年");
   }	
}
