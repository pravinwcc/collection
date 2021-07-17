package collection.array;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class ArraysListTest {

	public static void main(String[] args) {
		String a[] = new String[] { "abc", "klm", "xyz", "pqr" };
		List<String> ll = new ArrayList();
		ll.add("a");
		ll.add("b");

		List<String> list = Arrays.asList(a);
		for (String ss : list) {
			System.out.println("The list is:" + list);
		}
		ll.remove(0);
		System.out.println("The list is:" + ll);
	//	list.remove(0);

	}

}
