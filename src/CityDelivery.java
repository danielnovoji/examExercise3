public class CityDelivery {
    private String cityName;
    private int distance;

    public int getDistance() {
        return distance;
    }

    public String getCityName() {
        return cityName;
    }

    public double deliveryPrice () {
        double finalPrice = 0;
        finalPrice =  this.distance*4.5;
        return finalPrice;
    }

}
