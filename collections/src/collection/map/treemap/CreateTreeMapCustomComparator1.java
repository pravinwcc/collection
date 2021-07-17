package collection.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class CreateTreeMapCustomComparator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tree map key must be comparable object
		Map<Employee, Double> map = new TreeMap<Employee, Double>();

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		e1.setName("A");
		e1.setSalary(40);

		e2.setName("B");
		e2.setSalary(20);

		e3.setName("C");
		e3.setSalary(30);

		map.put(e1, 99.5);
		map.put(e2, 67.4);
		map.put(e3, 67.4);

		for (Map.Entry<Employee, Double> m : map.entrySet()) {
			System.out.println(m.getKey().getName() + " " + m.getKey().getSalary());
		}
	}

}
