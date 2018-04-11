package wang.util.java;

import java.sql.Date;
import java.time.LocalDate;

public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date(999);
		System.out.println(date);
		long mes =date.getTime();
		System.out.println(mes);
      LocalDate s = date.toLocalDate();
      System.out.println(s);
	}

}
