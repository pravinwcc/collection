package collection.hashcodendequal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) 
	{
		   Person p1 = new Person("A", 21, new Date(1980,12, 1));
	       Person p2 = new Person("B", 21, new Date(1980,12, 1));
	       Person p3 = new Person("C", 21, new Date(1981,12,1));
	       
	       Map mp= new HashMap();
	       
	       mp.put(p1, "a");
	       mp.put(p2, "b");
	       mp.put(p3, "c");
	       
	       System.out.println(mp.get(p1));

	}

}
