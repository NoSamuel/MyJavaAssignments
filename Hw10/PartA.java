//Sam Jin
//AT Java
public class PartA{
public static void main(String[] args) {
    String name = "Harry";
    System.out.println("The last letter of the name is " +
    name.charAt(name.length())); //name.length will return the number five since Harry has letters
    //but the function charAt starts it's counting from 0, so the last letter in Harry will be numbered 4
    //Therefore, this function will try to retrive something out of bounds (Runtime error)
    }
}