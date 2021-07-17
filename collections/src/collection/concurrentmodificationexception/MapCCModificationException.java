package collection.concurrentmodificationexception;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapCCModificationException {

	public static void main(String[] args) {
		Map<String,String> myMap = new HashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");
 
        Iterator<String> it1 = myMap.keySet().iterator();
        System.out.println("Size"+myMap.size());
        while(it1.hasNext()){
            String key = it1.next();
            System.out.println("Map Value:"+myMap.get(key));
            if(key.equals("2")){
                myMap.put("1","4");// Work fine
               // myMap.put("4", "4");// throw concurrent modification exception
            }
        }
        System.out.println("Size"+myMap.size());
 

	}

}
