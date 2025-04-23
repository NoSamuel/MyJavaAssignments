import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the file path: ");
        String filePath = in.next();
        ArrayList<Employee> employees = new ArrayList<Employee>();

        try(
            FileInputStream fileInputStream = new FileInputStream(filePath);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        ) {
            Employee.lastIDUsed = dataInputStream.readInt();
            while (dataInputStream.available() > 0) {
                Employee inputEmployee = Employee.readFromStream(dataInputStream);
                employees.add(inputEmployee);
            }
        } catch (Exception e) {
            System.err.println("An error occured");
            in.close();
            return;
        }

        for (Employee employee : employees) {
            employee.displayInfo();
        }
        in.close();
    }
}