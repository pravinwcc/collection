package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {

	public static void main(String[] args) {
		Map<Integer,String> mp= new HashMap<Integer,String>();
		
		Object o1=mp.put(1, "a");
		
		Object o2=mp.put(1, "b");
		
		System.out.println(o1);
		System.out.println(o2);

	}

}
