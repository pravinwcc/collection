package collection.copyonwritearraysettest;

import java.util.concurrent.CopyOnWriteArraySet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArraySet<String> s= new CopyOnWriteArraySet<>();
		s.add("Pravin");
		s.add("Pravin");
		System.err.println(s);
		

	}

}
