

public class FengzhuangDemo1 {
public static void main(String[] args) {
	try{
		ProcessBuilder proc =new ProcessBuilder("notepad","textfile");
		proc.start();
	}catch(Exception e){
		e.printStackTrace();
		
	}
 
}
}
