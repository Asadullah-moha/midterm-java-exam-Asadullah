package design;

@SuppressWarnings({"ALL", "unused"})
public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * * more to design an application that will meet for fortune 500 Employee Information
	 * * Services.
	 * *
	 * * Use any databases[MySql] to store data and retrieve data.
	 **/
	public static class EmployeeInfo {
		@SuppressWarnings("unused")
		private int employeeId;
		@SuppressWarnings("unused")
		private String employeeName;
		@SuppressWarnings("unused")
		private String department;
		@SuppressWarnings("unused")
		private double salary;

		public EmployeeInfo(int employeeId, String employeeName, String department, double salary, Object args) {
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.department = department;
			this.salary = salary;


			class EmployeeDatabase {
				@SuppressWarnings("unused")
				public static void insertEmployee(EmployeeInfo employee1) {
				}

				@SuppressWarnings("unused")
				public static EmployeeInfo getEmployeeById(int i) {

					return null;
				}

				public static void deleteEmployee() {
				}

				public static void updateEmployee() {
				}

			}

				EmployeeInfo employee1 = new EmployeeInfo(101, "John Doe", "HR", 55000.0, args);
				EmployeeInfo employee2 = new EmployeeInfo(102, "Alice Smith", "IT", 65000.0, args);

				EmployeeDatabase.insertEmployee(employee1);
				EmployeeDatabase.insertEmployee(employee2);

				EmployeeInfo retrievedEmployee = EmployeeDatabase.getEmployeeById(101);
				System.out.println("Retrieved Employee: " + retrievedEmployee);

				employee1.setSalary();
				EmployeeDatabase.updateEmployee();

				EmployeeDatabase.deleteEmployee();

		}

		private void setSalary() {
		}
	}
}
