package collection.concurrentmodificationexception;

import java.util.*;

public class IteratorExample {
 
    public static void main(String args[]){
        List<String> myList = new ArrayList<String>();
 
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        
       // myList.remove(4); // Work fine
 
        Iterator<String> it = myList.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println("List Value:"+value);
            if(value.equals("3")) {
            	it.remove();// Work fine
            	//myList.remove(value);// throw concurrent modification exception
            	//myList.add("3");// throw concurrent modification exception
            }
        }
 
        
    }
}

