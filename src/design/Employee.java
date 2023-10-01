package design;

@SuppressWarnings("ALL")
public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.
	
	//employeeId() will return employee id.
	@SuppressWarnings("unused")
	public int employeeId();
	
	//employeeName() will return employee name
	@SuppressWarnings("unused")
	public String employeeName();

	//assignDepartment() will assign employee to departments
	@SuppressWarnings("unused")
	public default void assignDepartment() {

	}

	//calculate employee salary
	@SuppressWarnings("unused")
	public int calculateSalary();
	
	//employee benefit
	@SuppressWarnings("unused")
	public void benefitLayout();

}
