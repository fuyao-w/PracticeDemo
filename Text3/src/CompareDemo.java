
public class CompareDemo {
	 static String arr[]={"Now","is","the","time","for","all","good","men"};
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
   for(int j=0;j<arr.length;j++){
	   for(int i=j+1;i<arr.length;i++){
		   if(arr[i].compareTo(arr[j])<0){
			   String t=arr[j];
			   arr[j]=arr[i];
			   arr[i]=t;
		   }
	   }
	   System.out.println(arr[j]);
   }
   
	}

}
