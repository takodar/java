package testpkg;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("California", "Sacramento");
		map.put("Massachusetts", "Boston");
		map.put("New Hampshire", "Concord");
		System.out.println(map);
		
		map.put("Alaska", "Juneau");
		System.out.println(map);
		
		String cap = map.get("Massachusetts");
		System.out.println("Capital of Massachusetts is: " + cap);
		
		map.remove("California");
		System.out.println(map);
	}

}
