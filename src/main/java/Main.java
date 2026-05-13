import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        //Array list is created storing asset references
        ArrayList<Asset> myAssets = new ArrayList<>();

        //adding houses
        myAssets.add(new House(
                "My house",
                "2020-01-01",
                250000,
                "123 main st",
                1,
                2000,
                8000
        ));
        //loop through assets
        for (Asset asset : myAssets){

            System.out.println("-----------");

            System.out.println("Descrition: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAccuired());
            System.out.println("Original Cost: " + asset.getOriginalCost());
            System.out.println("Current Value: " + asset.getValue());
        }
    }
}
