class Item {
   private int value;

   public void setValue(int value) {
    //change the "value" here to "this.value"
       this.value = value;
   }
   public int getValue() {
       return value;
   }
}

public class PartB {
    public static void main(String[] args) {
        //this program is going to output 0 | 0 because the claim "this" is redundent in the class Item
       Item myItem = new Item();
       System.out.print(myItem.getValue() + " | ");
       myItem.setValue(13);
       System.out.println(myItem.getValue());
   }
}
