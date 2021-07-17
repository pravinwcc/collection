package collection.set;

import java.util.*;  
class LinkedHashSetTest{  
 public static void main(String args[]){  
   
  LinkedHashSet<String> al=new LinkedHashSet<String>();  
  al.add(null);  
  al.add(null);  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  