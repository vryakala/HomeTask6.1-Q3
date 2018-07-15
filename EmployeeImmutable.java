package immutableEmployeeCustomClassObjects;

import java.util.Date;

public final class EmployeeImmutable {

	private final int id;
	private final String name;
	private final Date DOB;
	private final int salary;

	public EmployeeImmutable(EmployeeBuilder employeeBuilder) {
		this.id = employeeBuilder.id;
		this.name = employeeBuilder.name;
		this.DOB = employeeBuilder.DOB;
		this.salary = employeeBuilder.salary;
	}

	public int getid() {
		return id;
	}

	public String getname() {
		return name;
	}

	public Date getDOB() {
		return DOB;
	}

	public int getsalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", DOB=" + DOB + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DOB == null) ? 0 : DOB.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeImmutable other = (EmployeeImmutable) obj;
		if (DOB == null) {
			if (other.DOB != null)
				return false;
		} else if (!DOB.equals(other.DOB))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	public static final class EmployeeBuilder {

		private int id;
		private String name;
		private Date DOB;
		private int salary;

		private EmployeeBuilder() {

		}

		public static EmployeeBuilder anEmployee() {
			return new EmployeeBuilder();
		}

		public static EmployeeBuilder anEmployee(EmployeeImmutable employee) {
			return anEmployee().withId(employee.getid()).withName(employee.getname()).withDateOfBirth(employee.getDOB())
					.withSalary(employee.getsalary());
		}

		public EmployeeBuilder withId(int id) {
			this.id = id;
			return this;

		}

		public EmployeeBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public EmployeeBuilder withDateOfBirth(Date dateOfBirth) {
			this.DOB = DOB;
			return this;
		}

		public EmployeeBuilder withSalary(int salary) {
			this.salary = salary;
			return this;

		}

		public EmployeeImmutable build() {
			return new EmployeeImmutable(this);

		}

	}

}
