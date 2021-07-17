package collection.list;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

class CopyOnWriteArrayListTest {
	public final static void main(String args[]) {
		
		List list = new CopyOnWriteArrayList();
		list.add("vivek");
		list.add("kumar");
		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			list.add("abhishek");
		}
		System.out.println("After modification:");
		Iterator i2 = list.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
}