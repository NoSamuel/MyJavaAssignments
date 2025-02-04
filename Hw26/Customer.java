public class Customer{
    private String companyName;
    private double totalsales;
    private int numberSales;
    private int regionCode;

    private int serialNumber;

    public static int lastSerialNumberUsed;

    //declare constructor
    public Customer(String name, int regionCode) {
        companyName = name;
        totalsales = 0;
        numberSales = 0;
        this.regionCode = regionCode;

        Customer.lastSerialNumberUsed++;
        this.
    }

    public static double getTaxRate(int regionCode){
        switch(regionCode){
            case 1:
            //NH
            return 0;
            case 2:
            //ME
            return 0.055;
            case 3:
            //VT
            return 0.06;
            case 4:
            //MA
            return 0.0625;
            default:
            return 0;
        }
    }

    public String getName() {
        // Implement here.
        return companyName;
    }
   public void setName(String new_name) {
       // Implement here.
       this.companyName = new_name;
    }
   public void setRegion(int new_region) {
       // Implement here.
    }
   public int getRegion() {
       // Implement here.
       return regionCode;
    }
   public void addSale(double amount) {
       // Implement here.
       this.totalsales = totalsales + amount;
    }
   public double getSales() {
       // Implement here.
    }
   public int getNumber() {
       // Implement here.
    }
   public double getAverage() {
       // Implement here.
    }

}