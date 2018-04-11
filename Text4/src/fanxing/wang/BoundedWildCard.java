package fanxing.wang;

public class BoundedWildCard {
static void showXY(Coodrds<?> c){
	System.out.println("X Y coordinates:");
	for(int i=0;i<c.coodrds.length;i++){
		System.out.println(c.coodrds[i].x+"   "+c.coodrds[i].y);
		
	}
}
static void showXYZ(Coodrds<? extends ThreeD> c){
	System.out.println("X Y coordinates:");
	for(int i=0;i<c.coodrds.length;i++){
		System.out.println(c.coodrds[i].x+"   "+c.coodrds[i].y+"   "+c.coodrds[i].z);
}
}
	static void showXYZT(Coodrds<? extends FourD> c){
		System.out.println("X Y Z coordinates:");
		for(int i=0;i<c.coodrds.length;i++){
			System.out.println(c.coodrds[i].x+"   "+c.coodrds[i].y+"   "+c.coodrds[i].z+"   "+c.coodrds[i].t);
	}	
	}
	

	public static void main(String[] args) {
TwoD td[]={
		new TwoD(0,0),
		new TwoD(7,9),
		new TwoD(6,8),
		new TwoD(9,4),
		new TwoD(-5,-1)
};
Coodrds<TwoD> tdlocs=new Coodrds<TwoD>(td);
System.out.println("Contents of tdlocs");
showXY(tdlocs);

FourD fd[]={
	new FourD(1, 2, 3, 4),
	new FourD(5, 6, 7, 8),
	new FourD(33,22 ,2 , 99)
};
Coodrds<FourD> fdlocs =new Coodrds<FourD>(fd);
showXY(fdlocs);
showXYZ(fdlocs);
showXYZT(fdlocs);
	}

}
class TwoD{
	int x,y;
	public TwoD(int x,int y) {
		this.x=x;
		this.y=y;

	}
}
class ThreeD extends TwoD{
	int z;
	public ThreeD(int x, int y ,int z) {
	 super(z,y);
	 this.z=z;
		
	}
}
class FourD extends ThreeD{
	int t;
	public FourD(int x,int y,int z,int t) {
	super(x,y,z);
	this.t=t;
		// TODO 自动生成的构造函数存根
	}
}
class Coodrds<T extends TwoD>{
	T[] coodrds;
	public Coodrds(T[] o) {
	  coodrds =o;
		// TODO 自动生成的构造函数存根
	}
}