package wangfuyao;  
import java.util.HashMap;  
import java.util.Map;  
  
public class Register{  
    private String name;  
    private String mima;     //在用户自己输入的情况下就用String类型  
   
    private  String n ="admin";
    private String m ="123";
    Map<String, String> errors = null;  
      
    public Register(){  
        this.name = "";  
        this.mima = "" ;  
      
        this.errors = new HashMap<String, String>();  
    }  
      
    public boolean isValidate(){  
        boolean flag = true;  
        if(!this.name.equals(n)){  
            flag = false;  
            this.name = "";  
            this.errors.put("errname", "登录名错误");  
        }  
       
        if(!this.mima.equals(m)){  
            flag = false;  
            this.mima = "";  
            this.errors.put("errage", "密码只能是数字.");  
        }  
        return flag;  
    }  
      
    public String getErrorMsg(String key){  
        String value = this.errors.get(key);  
        return value == null ? "" : value;  
    }  
      
    public void setName(String name){  
        this.name = name;  
    }  
    public void setMima(String mima){  
        this.mima = mima;  
    }  
  
    public String getName(){  
        return this.name;  
    }  
    public String getMima(){  
        return this.mima;  
    }  
   
}