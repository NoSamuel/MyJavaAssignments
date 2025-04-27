import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class PartA {
    public static void main(String[] args) {
        String lastName;
        String firstName;
        double salary;
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        while (true) {
            System.out.print("Type e to add an employee or q to quit");
            String input = in.nextLine().toLowerCase();
            if (input.equals("q")){
                break;
            } else {
                System.out.println("Enter the last name of your employee: ");
                lastName = in.nextLine();
                System.out.print("First Name: ");
                firstName = in.nextLine();
                System.out.print("Salary: ");
                salary = 0;
            }
            try {
                    input = in.nextLine();
                    salary = Double.parseDouble(input);
                } catch (InputMismatchException e) {
                    System.err.println("Error parsing salary.");
                    System.err.println("Using $0 as defauly salary.");
                }
                System.out.println();
                Employee.lastIDUsed++;
                Employee e = new Employee(lastName, firstName, Employee.lastIDUsed, salary);
                employees.add(e);
            }

        //method to display information
        for (int i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i).getFirstName());
        }

        String filepath = "data.bin";
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filepath);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {
            // save the last ID used info.
            dataOutputStream.writeInt(Employee.lastIDUsed);
            for (Employee e : employees) {
                e.writeToStream(dataOutputStream);
            }

            // we're done. the streams should automatically be closed as we exit the try
            // with resources clause.
            System.out.println("Data saved to \"" + filepath + "\"");
        } catch (IOException e) {
            System.err.println("Error writing to output file.");
            System.err.println(e.getMessage());
        }
        in.close();
    }
}
