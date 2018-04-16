
public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		shape square = (shape)ShapeCache.getShape("1");
		System.out.println(square.getType());
	}
}
