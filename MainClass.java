package employeeCustomClassObjects;

import java.util.Date;
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		HashMap<Employee, String> EmployeeMap = new HashMap<Employee, String>();

		Employee employee1 = new Employee();
		employee1.setid(1);
		employee1.setname("sachin");
		employee1.setDOB(new Date(1987, 2, 1));
		employee1.setsalary(50000);

		EmployeeMap.put(employee1, "India");

		Employee employee2 = new Employee();
		employee2.setid(1);
		employee2.setname("sachin");
		employee2.setDOB(new Date(1987, 2, 1));
		employee2.setsalary(50000);

		EmployeeMap.put(employee2, "Japan");

		System.out.println(EmployeeMap);
	}

}
