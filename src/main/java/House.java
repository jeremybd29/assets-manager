public class House {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description,
                 String dateAcquired,
                 double originalCost,
                 String address,
                 int condition,
                 int squareFoot,
                 int lotSize){

        //call parent constrictor
        super(description, dateAcquired, originalCost);

        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }
    // getters and setters

}
