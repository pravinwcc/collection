package collection.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {

	 public static void main(String args[]) {
	     
	        //NavigableMap extends SortedMap to provide useful navigation methods
	        NavigableMap<Integer, String> navigableMap = new TreeMap<Integer, String>();
	        NavigableMap<Range, String> navigableMap1 = new TreeMap<Range, String>();
	     
	        Range r1= new Range();
	        Range r2= new Range();
	        Range r3= new Range();
	        Range r4= new Range();
	        r1.setStartRange(1);
	        r1.setEndRange(10);
	        
	        r2.setStartRange(11);
	        r2.setEndRange(20);
	        
	        r3.setStartRange(2);
	        r3.setEndRange(11);
	        
	        r4.setStartRange(3);
	        r4.setEndRange(3);
	        
	        navigableMap1.put(r1, "A");
	        navigableMap1.put(r2, "B");
	        navigableMap1.put(r3, "C");
	        System.out.println("SorteMap : " + navigableMap1);
	        System.out.println("lowerKey from 1 : " + navigableMap1.ceilingKey(r1).endRange);
	        System.out.println("lowerKey from 2 : " + navigableMap1.ceilingKey(r2).endRange);
	        System.out.println("lowerKey from 3 : " + navigableMap1.ceilingKey(r3).endRange);
	        System.out.println("lowerKey from 4 : " + navigableMap1.ceilingKey(r4).endRange);
	        System.out.println("lowerKey from 4 : " + navigableMap1.higherKey(r4).endRange);
	        
	       navigableMap.put(2, "Good programming language");
	       navigableMap.put(3, "Another good programming language");
	       navigableMap.put(8, "Another JVM language");
	       navigableMap.put(9, "Language which Google use");
	     
	        System.out.println("SorteMap : " + navigableMap);
	     
	        //lowerKey returns key which is less than specified key
	        System.out.println("lowerKey from 2 : " + navigableMap.lowerKey(1));
	     
	        //floorKey returns key which is less than or equal to specified key
	        System.out.println("floorKey from 2: " + navigableMap.floorKey(3));
	     
	        //ceilingKey returns key which is greater than or equal to specified key
	        System.out.println("ceilingKey from 2: " + navigableMap.ceilingKey(4));
	     
	        //higherKey returns key which is greater specified key
	        System.out.println("higherKey from 2: " + navigableMap.higherKey(2));
	     
	     
	        //Apart from navigagtion methodk, it also provides useful method
	        //to create subMap from existing Map e.g. tailMap, headMap and subMap
	     
	        //an example of headMap - returns NavigableMap whose key is less than specified
	      //  NavigableMap<String, String> headMap = navigableMap.headMap("Python", false);
	       // System.out.println("headMap created form navigableMap : " + headMap);
	             
	        //an example of tailMap - returns NavigableMap whose key is greater than specified
	        //NavigableMap<String, String> tailMap = navigableMap.tailMap("Scala", false);
	       // System.out.println("tailMap created form navigableMap : " + tailMap);
	     
	        //an example of subMap - return NavigableMap from toKey to fromKey
	      //  NavigableMap<String, String> subMap = navigableMap.subMap(1, false ,"Python", false);
	        //System.out.println("subMap created form navigableMap : " + subMap);
	    }
	}

	

