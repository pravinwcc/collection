package collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import collection.hashcodendequal.Person;

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Map<Person, Employee> mp= new HashMap<Person, Employee>();
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Person pp= new Person();
		pp.setId(1);
		Person ppp= new Person();
		ppp.setId(2);
		e1.setAge(1);
		e1.setName("a");
		
		e2.setAge(2);
		e2.setName("b");
		
		e3.setAge(3);
		e3.setName("c");
		
		mp.put(null, e1);
		mp.put(pp,null);
		mp.put(ppp, null);
		
		for(Map.Entry<Person, Employee> mptest: mp.entrySet()) {
			System.out.println(mptest.getKey()+" Values-->"+mptest.getValue());
		}

	}

}
