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
            System.out.println("获取控制台失败");
            return;}
        System.out.print("请输入密码：");
        c = con.readPassword();
        System.out.println();
        str1 = c.toString();
        System.out.print("输入的密码为：");


    }
}
