import java.util.HashMap;
import java.util.List;


public class ShapeCache {
private static HashMap<String,shape> shapeMap = new HashMap<String, shape>(); 

public static shape getShape(String shapeID){
	shape s = shapeMap.get(shapeID);
		return (shape)s.clone();
	
}

public static void loadCache() {
	
	Square sq = new Square();
	
	sq.setId("1");
	
	shapeMap.put("1", sq);
}
}
