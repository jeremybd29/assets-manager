public class House extends Asset {
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
    public String getAddress() {
        return address;
    }
    public int getCondition(){
        return condition;
    }
    public int getSquareFoot(){
        return squareFoot;
    }
    public int getLotSize(){
        return lotSize;
    }
    //override asset getValue()
    @Override
    public double getValue(){

        double pricePerFoot = 0;

        switch(condition ) {

            case 1:
                pricePerFoot = 180;
                break;
            case 2:
                pricePerFoot = 160;
                break;
            case 3:
                pricePerFoot = 140;
                break;
            case 4:
                pricePerFoot = 120;
                break;
        }
        return (squareFoot * pricePerFoot)
                +(lotSize * 0.25);
    }

}
