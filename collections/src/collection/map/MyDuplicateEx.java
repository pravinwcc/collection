package collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
 
public class MyDuplicateEx {
 
    public static void main(String a[]){
         
        Map<Price, String> hm = new Hashtable<Price, String>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        
        hm.put(new Price("Orange", 30), "Orange");
        hm.put(new Price("Orange", 30), "Orange");
    	
    /*	HashMap<String,Price> hm = new HashMap<String,Price>();
    	
    	hm.put("Banana",new Price("Banana", 20));
    	hm.put("apple",new Price("apple", 30));
    	hm.put("orrange",new Price("orrange", 40));
    	hm.put("11",new Price("Banana", 20));*/
        
        Set<Price> keys = hm.keySet();
        for(Price p:keys){
            System.out.println(p+"==>"+hm.get(p));
        }
        
       
    }
     

}
