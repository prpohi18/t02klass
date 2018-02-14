package t02klass;

/**
 *
 * @author Taavi Meinberg
 */
public class Cars {
    protected String brand;
    protected Double avgSpeed;
    protected Double distanceTraveled;
    
    public Cars(String brand, Double avgSpeed, Double distanceTraveled){
        this.brand = brand;
        this.avgSpeed = avgSpeed;
        this.distanceTraveled = distanceTraveled;
    }

    public String getBrand() {
        return brand;
    }

    public Double getAvgSpeed() {
        return avgSpeed;
    }

    public Double getDistanceTraveled() {
        return distanceTraveled;
    }
    
    public String compareTwoCarSpeeds(Cars car2){
        if (getAvgSpeed() > car2.getAvgSpeed()) {
            return getBrand() + " on kiirem kui " + car2.getBrand();
        } else{
            return car2.getBrand() + " on kiirem kui " + getBrand();
        }
    }
    
    public String compareTwoCarDistance(Cars car2){
        if (getDistanceTraveled() > car2.getDistanceTraveled()) {
            return getBrand()+ " on sõitnud: " + (getDistanceTraveled() - car2.getDistanceTraveled()) + " km rohkem kui " + car2.getBrand();
        } else{
            return car2.getBrand()+ " on sõitnud: " + (car2.getDistanceTraveled() - getDistanceTraveled()) + " km rohkem kui " + getBrand();
        }
    }
    
}
