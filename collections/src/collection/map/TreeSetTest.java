package collection.map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class TreeSetTest{  
	 public static void main(String args[]){  
	   
	 // HashSet al=new HashSet(); 
		 Set al=new TreeSet();
	   
	  al.add("Ravi"); 
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  //al.add(null);// Throw java.lang.NullPointerException
	  

	  Iterator itr=al.iterator();
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}  
