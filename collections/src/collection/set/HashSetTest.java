package collection.set;

import java.util.*;  
class HashSetTest{  
 public static void main(String args[]){  
   
  HashSet al=new HashSet(); 
   
  al.add("Ravi"); 
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
 System.out.println( al.add(null)); 
 System.out.println( al.add(null)); 

  Iterator itr=al.iterator();
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  

