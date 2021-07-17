package collection.copyonwritearraylisttest;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * Java program to demonstrate What is CopyOnWriteArrayList in Java, 
 * Iterator of CopyOnWriteArrayList
 * doesn’t support add, remove or any modification operation.
 *
 * @author Java67
 */
public class CopyOnWriteArrayListTest{

    public static void main(String args[]) {
      
        CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<String>();
        threadSafeList.add("Java");
        threadSafeList.add("J2EE");
        threadSafeList.add("Collection");
      
        //add, remove operator is not supported by CopyOnWriteArrayList iterator
       Iterator<String> failSafeIterator = threadSafeList.listIterator();
        while(failSafeIterator.hasNext()){
            System.out.printf("Read from CopyOnWriteArrayList : %s %n", failSafeIterator.next());
            //failSafeIterator.remove(); //not supported in CopyOnWriteArrayList in Java
            threadSafeList.add("abc");
            threadSafeList.remove("Java");
        }
        
        Iterator<String> failSafeIterator1 = threadSafeList.iterator();
        while(failSafeIterator1.hasNext()){
            System.out.printf("Read from CopyOnWriteArrayList : %s %n", failSafeIterator1.next());
            //failSafeIterator.remove(); //not supported in CopyOnWriteArrayList in Java
            threadSafeList.add("abc");
        }
    }
}
