package Assignments.program9;

// Vannara Thong CIS-18A Chapter 10, p.1001, #10.15
/**************************************************************
 * Programmer Name: Vannara Thong
 * Assignment Start: 05/12/2024 12:30PM
 * Assignment Completion:05/12/2024 7:45PM
 * Total Hours for Assignment: 7.15 Hours
 * Comments: N/A
 **************************************************************/

// Fig. 10.9: PayrollSystemTest.java

// Employee hierarchy test program.

public class PayrollSystemTest {
      public static void main(String[] args) {
            Employee[] employees = new Employee[5];

            employees[0] = new SalariedEmployee(
                        "John", "Smith", "111-11-1111", 800.00);
            employees[1] = new HourlyEmployee(
                        "Karen", "Price", "222-22-2222", 16.75, 40);
            employees[2] = new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", 10000, .06);
            employees[3] = new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "444-44-4444", 5000, .04, 300);
            employees[4] = new PieceWorker(
                        "Forrest", "Gump", "555-55-5555", 12.50, 300);

            System.out.printf("Employees processed polymorphically:%n%n");

            // Display employees
            for (Employee current : employees) {
                  System.out.println(current); // invokes toString
                  System.out.printf("Earnings: $%,.2f\n\n", current.earnings());
            }

            System.out.println("\nThank you for using the Payroll application.\n" + "Time of calculation is "
                        + java.time.LocalDate.now() + " | " + java.time.LocalTime.now());
            System.exit(0);

      }

}
