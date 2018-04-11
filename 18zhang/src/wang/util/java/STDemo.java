package wang.util.java;

import java.util.*;

public class STDemo {
	
	static String in ="title=java:the complete reference;"+"author-schildt;"+"publisher=mcgraw-hill"+"copyright=2011";

	public static void main(String[] args) {
	StringTokenizer st=new StringTokenizer(in,"=;");
	while(st.hasMoreTokens()){
		String key=st.nextToken();
		String val=st.nextToken();
		System.out.println(key+"\t"+val);
	}
	}

}
