package wangfuyao;

import java.io.Console;
import java.io.IOError;
import java.io.IOException;
 
public class ConsloeDemo {


    public static void main(String[] args) {
        char[] c;
        String str1;
        Console con = null;
        try {
        	 con = System.console();
		} catch (Exception e) {
			e.printStackTrace();
		}
       
        if (con == null) {
            System.out.println("��ȡ����̨ʧ��");
            return;}
        System.out.print("���������룺");
        c = con.readPassword();
        System.out.println();
        str1 = c.toString();
        System.out.print("���������Ϊ��");


    }
}
