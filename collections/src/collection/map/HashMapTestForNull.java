package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import collection.hashcodendequal.Person;

public class HashMapTestForNull {

	public static void main(String[] args) 
	{
		Map<String, String> mp= new HashMap<String, String>();
	
		
		mp.put(null, null);
		mp.put("a",null);
		mp.put("b", null);
		
		Set s= mp.entrySet();
		Iterator it= s.iterator();
		
		for(Map.Entry<String, String> mptest: mp.entrySet()) {
			System.out.println(mptest.getKey()+" Values-->"+mptest.getValue());
		}

	}
}
