public class Counter {
    //Construction
    public Counter() {
        //initialize count to 0
        this.count = 0;
    }

    //overloaded contructor
    public Counter(int count) {
        this.count = count;
    }

    //private variables
    private int count = 0;
    private final int MAX_COUNT = 9999;

    public int view() {
        return count;
    }
    
    public void count() {
        this.count = this.count + 1;
        if (this.count > MAX_COUNT) {
            this.count = 0;
        }
    }
    
    public void reset() {
        this.count = 0;
    }
    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println("Count = " + c.view());
        c.count();
        c.reset();
    }   
}