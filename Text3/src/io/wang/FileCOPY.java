package io.wang;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FileCOPY {
  public static void main(String[] args) throws IOException {
	 byte i[]=new byte[9];
	 int []a=new int[9];
	File f=new File("G:\\1233.txt");
	
		
	
			FileInputStream in1=null;
					in1=new FileInputStream(f);
	
	
	
   a[0]=in1.read();
   in1.close();
		System.out.println((char)a[0]);
	
}
}
