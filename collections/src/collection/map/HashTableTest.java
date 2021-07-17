package collection.map;


import java.util.*;  
class HashTableTest{  
 public static void main(String args[]){  
   
  Hashtable hm=new Hashtable();  
  
  hm.put(null,"aaa");  //run time error
  hm.put(102,"Ravi");  
  hm.put(101,"Vijay");  
  hm.put(103,"Rahul");  
  hm.put(100,null);  //run time error
  
  Set set=hm.entrySet();  
  Iterator itr=set.iterator();  
  
  while(itr.hasNext()){  
   Map.Entry m=(Map.Entry)itr.next();  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  




