package collection.concurrentmodificationexception;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCCModificationExc {

	public static void main(String[] args) {
		  Set<String> set = new HashSet<String>();
	        set.add("1");
	        set.add("2");
	        set.add("3");
	 
	        Iterator<String> itr = set.iterator();
	        System.out.println("Size"+set.size());
	        while(itr.hasNext()){
	            
	        	if(itr.next().equals("2")){
	                set.add("1");// Work fine
	               //set.add("4");// throw concurrent modification exception
	        	  //set.remove("2"); // throw concurrent modification exception
	            }
	        }
	        System.out.println("Size"+set.size());

	}

}
