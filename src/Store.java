public class Store {
    private Delivery[] deliveryListFromStore;
    private CityDelivery[] listOfCitiesAndDistances;


    public String mostExpensiveDelivery() {
        String mostExpensive= "";
        int max =0;
        for (int i = 0; i < this.listOfCitiesAndDistances.length; i++){
            if (max<this.listOfCitiesAndDistances[i].getDistance()){
                max = this.listOfCitiesAndDistances[i].getDistance();
                mostExpensive=this.listOfCitiesAndDistances[i].getCityName();
            }
        }
        return mostExpensive;
    }



    public String[] clientsWithExpensiveDelivery (int price){
        int counter =0;
        double costOfDelivery=0;
        String initialsName="";
        for (int i = 0 ; i< this.deliveryListFromStore.length; i++){
            counter=0;
            for (int j = 0 ; j < this.deliveryListFromStore.length;j++){
                if (this.deliveryListFromStore[i].getCityName().equals(this.deliveryListFromStore[j].getCityName())){
                    counter++;
                }
            }
            for (int j = 0 ; j < this.listOfCitiesAndDistances.length; j++){
            if (this.deliveryListFromStore[i].getCityName().equals(this.listOfCitiesAndDistances[j].getCityName())){
                costOfDelivery=this.listOfCitiesAndDistances[j].deliveryPrice()/counter;
                break;
            }
            if (costOfDelivery>price){
                initialsName+= this.deliveryListFromStore[i].getCustomerInitials()+" ";
            }
            }
        }
        return initialsName.split(" ");
    }

}
