import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        while (true) {
            System.out.print
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
    }
}