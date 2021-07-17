package collection.map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		List<String> l1= new ArrayList<String>();
		
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.add("d");
		
		Map<Integer,List<String>> mp= new HashMap<Integer,List<String>>();

		mp.put(1, l1);
		mp.put(2, l1);
		
		Iterator it= mp.entrySet().iterator();
		while (it.hasNext())
		{
			 Map.Entry em=(Map.Entry)it.next();  
			 System.out.print(em.getKey()+"-");
			 List l2=(List)em.getValue();
			 Iterator it1=l2.iterator();
			 while(it1.hasNext())
			 {
				 System.out.print(it1.next());	 
			 }
			 
			
		}
		

	}

}

