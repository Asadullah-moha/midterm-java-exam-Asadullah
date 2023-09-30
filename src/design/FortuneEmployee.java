package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * 	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * 	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * 	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * 	 * more to design an application that will meet for fortune 500 Employee Information
	 * 	 * Services.
	 * 	 *
	 * 	 * Use any databases[MySql] to store data and retrieve data.
	 *
	 **/
	public class EmployeeInfo {
		private int employeeId;
		private String employeeName;
		private String department;
		private double salary;

		public EmployeeInfo(int i, String johnDoe, String hr, double v) {
		}

		public void setSalary(double v) {
		}
	}
	public static class EmployeeDatabase {
		public static void insertEmployee(EmployeeInfo employee1) {
		}

		public static EmployeeInfo getEmployeeById(int i) {

            return null;
        }

		public static void deleteEmployee(int i) {
		}

		public static void updateEmployee(EmployeeInfo employee1) {
		}

		}
	public void main(String[] args) {
		EmployeeInfo employee1 = new EmployeeInfo(101, "John Doe", "HR", 55000.0);
		EmployeeInfo employee2 = new EmployeeInfo(102, "Alice Smith", "IT", 65000.0);

		EmployeeDatabase.insertEmployee(employee1);
		EmployeeDatabase.insertEmployee(employee2);

		EmployeeInfo retrievedEmployee = EmployeeDatabase.getEmployeeById(101);
		System.out.println("Retrieved Employee: " + retrievedEmployee);

		employee1.setSalary(58000.0);
		EmployeeDatabase.updateEmployee(employee1);

		EmployeeDatabase.deleteEmployee(102);

	}
}

