import java.time.Year;
public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description,
                   String dateAcquired,
                   double originalCost,
                   String makeModel,
                   int year,
                   int odometer){
        super (description, dateAcquired, originalCost);

        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }
    //getters

    public String getMakeModel(){
        return makeModel;
    }
    public int getYear(){
        return year;
    }
    public int getOdometer(){
        return odometer;
    }
    //override asset getValue()
    @Override
    public double getValue(){

        int currentYear = Year.now().getValue();

        int age = currentYear -year;

        double value = getOriginalCost();

        //depreciation
        if (age <= 3 ){
            value -= value * (.03 * age);
        } else if (age <=6){
            value -= value * (.08 * age);
        } else if (age <= 10) {
            value -= value * (.08 * age);

        } else {
            value = 1000;
        }

        //mileage reduction
        if (odometer > 100000 &&
               !(makeModel.contains("Honda")
                        || makeModel.contains("Toyota"))){
            value -= value * .75;
        }
        return value;
    }


}
