
public class StringReplace {


	public static void main(String[] args) {
		int i;
		String org="This is a test.this is ,too.";
		String search ="is";
		String sub ="was";
		String result ="";
		String s="   wang   ";
		do{
			System.out.println(org);
			i=org.indexOf(search);
			if(i!=-1){
				result =org.substring(0,i);
				result=result +sub;
				result =result +org.substring(i+search.length());
				org=result;
			}
			
		}while(i!=-1);
	System.out.println(sub.concat("wwww"));
	System.out.println(org.replace('t', 'T'));
	System.out.println(s.trim());
	System.out.println(sub.toUpperCase());
	}
	

}
