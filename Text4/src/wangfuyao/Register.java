package wangfuyao;  
import java.util.HashMap;  
import java.util.Map;  
  
public class Register{  
    private String name;  
    private String age;     //���û��Լ����������¾���String����  
    private String email;  
    private Map<String, String> errors = null;  
      
    public Register(){  
        this.name = "";  
        this.age = "";  
        this.email = "";  
        this.errors = new HashMap<String, String>();  
    }  
      
    public boolean isValidate(){  
        boolean flag = true;  
        if(!this.name.matches("\\w{6,15}")){  
            flag = false;  
            this.name = "";  
            this.errors.put("errname", "�û�����6~15λ����ĸ������.");  
        }  
        if(!this.email.matches("\\w+@\\w+.\\w+\\.?\\w*")){  
            flag = false;  
            this.email = "";  
            this.errors.put("erremail", "�����email��ַ���Ϸ�.");  
        }  
        if(!this.age.matches("\\d+")){  
            flag = false;  
            this.age = "";  
            this.errors.put("errage", "����ֻ��������.");  
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
    public void setAge(String age){  
        this.age = age;  
    }  
    public void setEmail(String email){  
        this.email = email;  
    }  
    public String getName(){  
        return this.name;  
    }  
    public String getAge(){  
        return this.age;  
    }  
    public String getEmail(){  
        return this.email;  
    }  
}