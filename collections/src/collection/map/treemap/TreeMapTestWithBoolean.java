package collection.map.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTestWithBoolean {
	public static void main(String args[]) {

		Map<Object,Boolean> hm = new TreeMap<>();

		hm.put(new Object(),false);
		hm.put(new Object(),false);
		hm.put(new Object(),false);
		hm.put(new Object(),false);
		hm.put(new Object(),false);
		hm.put(new Object(),false);

		Set set = hm.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry m = (Map.Entry) itr.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
