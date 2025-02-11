public class PartA {
    
    public static void main(String[] args) {
        BaseballCard Card = new BaseballCard("George Herman", 1935);
        BaseballCard newCard = new BaseballCard("George Herman", 1935);

        System.out.println(Card.toString());

        if (Card.equals(newCard)) {
            System.out.println("There are duplicate entries.");
        } else {
            System.out.println("There are no duplicate entries.");
        }
    }
}