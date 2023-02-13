public class Delivery {
    private int productsCost;
    private String address;
    private String customerName;
    public String getCityName() { // סעיף ב'
        String cityName ="";
        String [] splitter = this.address.split(",");

            cityName=splitter[splitter.length-1];

        return cityName;
    }

    public String getCustomerInitials () {
        String initials = "";
        String [] splitter = this.customerName.split(" ");
        for (int i = 0 ; i < splitter.length; i++) {
            initials+=splitter[i].charAt(0);
        }
        return initials;
    }

    public int getProductsCost() {
        return productsCost;
    }
}
