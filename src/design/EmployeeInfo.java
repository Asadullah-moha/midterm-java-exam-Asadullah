package design;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class EmployeeInfo {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	 static String companyName;
	static final int PERFORMANCE_BEST = 1;
	static final int PERFORMANCE_AVERAGE = 2;
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	private static double salary;
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(){

	}
    public EmployeeInfo(@SuppressWarnings("unused") int employeeId){
	}

	public EmployeeInfo(int i, String hr, double v) {

	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployeeBonus(int performance) {
		double bonus = 0;
        switch (performance) {
            case PERFORMANCE_BEST -> bonus = 0.10 * salary; // 10% bonus for best performance
            case PERFORMANCE_AVERAGE -> bonus = 0.08 * salary; // 8% bonus for average performance
            default -> {
            }
            // Handle other cases
        }
		return bonus;
	}

	public static void setSalary(double salary) {
		EmployeeInfo.salary = salary;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public int calculateEmployeePension(Date joiningDate, Date todaysDate) throws ParseException {
		int total=0;
		String todayDate;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter today's date in format (example: August,2017): ");
			todayDate = sc.nextLine();
		}
		String convertedJoiningDate = DateConversion.convertDate(String.valueOf(joiningDate));
        String convertedTodaysDate;
		convertedTodaysDate = DateConversion.convertDate(todayDate);

		//implement numbers of year from above two dates
		//Calculate pension

		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM,yyyy");

		long millisecondsInYear = 1000L * 60 * 60 * 24 * 365;
		long differenceInMilliseconds = 0;
		int yearsWithCompany = (int) (0);

		// Calculate pension based on the number of years with the company and salary
		total = (int) (0.05 * yearsWithCompany * salary); // Assuming 5% pension per year

		System.out.println("Years with the company: " + yearsWithCompany);
		return total;
	}
	private static class DateConversion {

		@SuppressWarnings("unused")
		public DateConversion() {
			this(null);
		}

		@SuppressWarnings("unused")
		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
            return monthDate + "/" + extractMonth[1];
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 7;
					break;
				case August:
					date = 8;
					break;
				case September:
					date = 9;
					break;
				case October:
					date = 10;
					break;
				case November:
					date = 11;
					break;
				case December:
					date = 12;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
