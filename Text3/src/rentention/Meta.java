package rentention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	String str();
	int val();
}
public class Meta {
@MyAnno(str="Annitation Example",val = 100)
public static void myMeth(){
	Meta ob =new Meta();
	try{
		Class<?> c =ob.getClass();
		Method m =c.getMethod("myMeth");
		MyAnno anno =m.getAnnotation(MyAnno.class);
		System.out.println(anno.str()+" "+anno.val());
		
	}catch(NoSuchMethodException e){
		e.printStackTrace();
	}
	
}
public static void main(String[] args) {
	myMeth();
	
}
}
