package testpkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class IteratorTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("California");
		list.add("Oregon");
		list.add("Washington");
		System.out.println(list);
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String value = listIterator.next();
			System.out.println(value);
		}

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("California", "Sacramento");
		map.put("Massachusetts", "Boston");
		map.put("New Hampshire", "Concord");
		System.out.println(map);
		Set<String> keys = map.keySet();
		Iterator<String> iterator = keys.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println("The capital of " + value + " is " + map.get(value));
			
		}
		
		
	}

}
