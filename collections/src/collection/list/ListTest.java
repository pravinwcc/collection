package collection.list;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Range> lst= new ArrayList<Range>();
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
	        
	       // r4.setStartRange(3);
	       // r4.setEndRange(3);
		
		lst.add(r1);
		lst.add(r2);
		lst.add(r3);
		//lst.add(r4);
		Collections.sort(lst);
		for(int i=1;i<lst.size();i++){
			if(lst.get(i-1).endRange>lst.get(i).startRange){
				System.out.println(lst.get(i).endRange);
			}
			
		}

	}

}
