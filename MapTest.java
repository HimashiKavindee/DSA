import java.util.HashMap;
import java.util.Map;


public class MapTest{
	public static void main(String args[]){
		Map<String, Integer>myMap = new HashMap<>();
		myMap.put("apple",10);
		myMap.put("banana",20);
		myMap.put("orange",15);
		System.out.println("quantity of apples " +myMap.get("apple"));
		System.out.println("iterating over the map");
		
		for(Map.Entry<String, Integer>entry :myMap.entrySet()){
		    System.out.println(entry.getKey()+ ": " + entry.getValue());
			
			
		}
		
		myMap.remove("banana");
		System.out.println("after removing banana: " +myMap);
		
	}
}	

