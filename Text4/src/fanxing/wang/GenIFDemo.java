package fanxing.wang;

class GenIFDemo {
	public static void main(String[] args) {
		Integer inums[]={1,2,3,4,5,6};
		Character chs[]={'b','t','y','i'};
		MyClass<Integer> iob=new MyClass<Integer>(inums);
		MyClass<Character> cob=new MyClass<Character>(chs);
		System.out.println("���������    "+iob.max());
		System.out.println("��������Сֵ    "+iob.min());
		
		
		System.out.println("�ַ����������    "+cob.max());
		System.out.println("�ַ���������Сֵ    "+cob.min());
		
	}
	
}
 class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T val[];      
    public MyClass(T[] o) {
    	val=o;
		// TODO �Զ����ɵĹ��캯�����
	}
	public T min(){
        	  T v =val[0];
        	  for(int i=1;i<val.length;i++){
        		  if(val[i].compareTo(v)<0)  v=val[i];
        	  }
        	  return v;
          }
          
          
          public T max(){
        	  T v=val[0];
        	  for(int i=1;i<val.length;i++){
        		  if(val[i].compareTo(v)>0)  v=val[i];
        	  }
        	  return v;
          }
          
          
          
          
          
	public static void main(String[] args) {
		

	}

}
 interface MinMax<T extends Comparable<T>>{
	 T min();
	 T max();
 }