package design;


import static org.junit.Assert.assertEquals;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        EmployeeInfo employee = new EmployeeInfo(101, "HR", 55000.0);

        // Calculate the bonus (you may need to adjust the expected value based on your logic)
        int bonus = (int) EmployeeInfo.calculateEmployeeBonus(3); // Assuming 3 years of service

        // Assert that the calculated bonus matches the expected value
        assertEquals(1650, bonus); // Adjust this value based on your logic

    }
}
