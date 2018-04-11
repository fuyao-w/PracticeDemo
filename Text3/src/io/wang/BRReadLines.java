package io.wang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		do{
			str =br.readLine();
			System.out.println(str);
			
		}while(!str.equals("stop"));
	}

}
