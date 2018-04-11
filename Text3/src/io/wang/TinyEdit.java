package io.wang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String  str[]=new String[100];
        for(int i=0;i<1000;i++){
        	str[i]=br.readLine();
        	if(str[i].equals("stop")){
        		break;
        	}}
        	System.out.println("\n"+"以上是你的文章");
        	for(int i1=0;i1<1000;i1++){
        		if(str[i1].equals("stop"))
        			break;
        		System.out.println(str[i1]);
        	}
        }
	}


