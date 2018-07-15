package employeeCustomClassObjects;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainClass1 {

	public static void main(String[] args) {

		// Employee is a mutable object. That will create problems with a
		// HashMap.

		HashMap<Employee, String> EmployeeMap = new HashMap<Employee, String>();

		Employee employee1 = new Employee();
		employee1.setid(1);
		employee1.setname("sachin");
		employee1.setDOB(new Date(1987, 2, 1));
		employee1.setsalary(50000);

		EmployeeMap.put(employee1, "India");

		for (Map.Entry<Employee, String> employeeStringEntry : EmployeeMap.entrySet()) {
			System.out.println(employeeStringEntry.getKey().hashCode());
		}

		// Mutating the Employee Object
		employee1.setname("Rahul");

		for (Map.Entry<Employee, String> employeeStringEntry : EmployeeMap.entrySet()) {
			System.out.println(employeeStringEntry.getKey().hashCode());
		}

		// The HashMap key is mutated and in the wrong bucket for that hashcode.

		System.out.println(EmployeeMap.get(employee1));

		Employee employee2 = new Employee();
		employee2.setid(1);
		employee2.setname("sachin");
		employee2.setDOB(new Date(1987, 2, 1));
		employee2.setsalary(50000);

		// EmployeeMap.put(employee2, "Japan");

		System.out.println(EmployeeMap.get(employee2));

		// Once the employee object is mutated, the hashcode of that object is
		// going to change

		// Now if we try to retrieve the object,(it has different hashcode) it
		// will go to a different bucket and will not be able to get the value.

		// Now the object placed in the hashmap is lost forever.
	}

}