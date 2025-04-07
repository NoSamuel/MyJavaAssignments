public class PartB {
    public static void main(String[] args) {
        Animal dog = new Animal("Martin", 50);
        Animal cat = new Animal("Ginger", 30);
        if (dog.compareTo(cat) == 0) {
            System.out.println(dog.getName() + " is the same weight as " + cat.getName());
        } else if (dog.compareTo(cat) == 1) {
            System.out.println(dog.getName() + " is heavier than " + cat.getName());
        } else {
            System.out.println(dog.getName() + " is lighter than " + cat.getName());
        }
    }
}
