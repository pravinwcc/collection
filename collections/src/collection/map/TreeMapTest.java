package collection.map;


import java.util.*;  
class TreeMapTest{  
 public static void main(String args[]){  
   
  Map hm=new TreeMap(); 
  
 //hm.put(null,"Amit"); //java.lang.NullPointerException
  /**
   * The comparator used to maintain order in this tree map, or
   * null if it uses the natural ordering of its keys.
   *
   * @serial
   
  private final Comparator<? super K> comparator;
*/
  hm.put(100,null);  
  hm.put(105,null); 
  hm.put(102,"Ravi");  
  hm.put(101,"Vijay");  
  hm.put(103,"Rahul");
  
  Set set=hm.entrySet();  
  Iterator itr=set.iterator();  
  
  while(itr.hasNext()){  
   Map.Entry m=(Map.Entry)itr.next();  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}

