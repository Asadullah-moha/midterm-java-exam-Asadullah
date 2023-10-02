package design;


import static org.junit.Assert.assertEquals;

public class UnitTestingEmployeeInfo {

    public static void main(String[] args) {
        EmployeeInfo employee = new EmployeeInfo(101, "HR", 55000.0);

        int bonus = (int) EmployeeInfo.calculateEmployeeBonus(3);

        assertEquals(1650, bonus);

    }
}
