package collection.list;

import java.util.*;  
class SortingTest{  
public static void main(String args[]){  
  
ArrayList al=new ArrayList();  
al.add(201.12);  
al.add(101.22);  
al.add(230);//internally will be converted into objects as Integer.valueOf(230)  
  
//Collections.sort(al);  
  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
}  
}  

