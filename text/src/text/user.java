package text;







public class user {
          String name;
          String password;
          String Name="admin";
          String Password="123";
         
          public user()
          {}
		public user(String name, String password) {
			super();
			this.name=name;
			this.password=password;
		}
public String getName() {
			return name;
		}
		public void setName(String name) {}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
          public void variety(String name,String password) throws AuthorlogExcption
          
          {
        	  
        	  if(!name.equals(Name))
        	  {
        		  throw new AuthorlogExcption("”√ªß√˚¥ÌŒÛ");
        	  }
        	  if(!password.equals(Password))
        	  {
        		  throw new AuthorlogExcption("√‹¬Î¥ÌŒÛ");
        	  }
          }
     
      
      
	
}
