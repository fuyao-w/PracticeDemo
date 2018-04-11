package io.wang;

import java.io.PrintWriter;

public class PrintwriterDemo {

	public static void main(String[] args) {
		PrintWriter pw=new PrintWriter(System.out,false);
         pw.println("dawad");
         double d=4.5e-7;
         pw.println(d);
	}

}
