package collection.list;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

class CopyOnWriteArrayListTestRemove {
	public final static void main(String args[]) {
		CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		list.add("vivek");
		list.add("kumar");
		Iterator i = list.iterator();
		//int j = 0;
		while (i.hasNext()) {
			String ss=null;
			System.out.println(ss=(String)i.next());
			
			list.add("abhishek");
			list.remove(ss);
		}
	}
}