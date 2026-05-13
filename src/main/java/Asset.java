// parent class
public class Asset {

    private String description;
    private String dateAcquired;
    private double originalCost;

    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }
    //getters and setters
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDateAccuired() {
        return dateAcquired;
    }
    public void setDateAccuired(String dateAccuired) {
        this.dateAcquired = dateAccuired;
    }
    public double getOriginalCost() {
        return originalCost;
    }
    public void setOriginalCost(double originalCost){
        this.originalCost = originalCost;
    }
    //returns current value of asset
    //default returns original cost

    public double getValue(){
            return originalCost;
    }

}
