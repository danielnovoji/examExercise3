public class Room {
    private int number;
    private boolean available;
    private int type;
    private static final int REGULAR_ROOM=1;
    private static final int UPGRADED_ROOM =2;
    private static final int SUITE_ROOM=3;

    public int floor(){
        return this.number/100;
    }
    public int calculatePrice(){
        int price = 2000;
        if (floor()>10){
            price+=(floor()-10)*100;
        }
        if (this.number%100<=5){
            price+=200;
        }
        if (this.number==UPGRADED_ROOM){
            price*=1.5;
        } else if (this.number==SUITE_ROOM) {
            price*=2.5;
        }
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean isTheSameType(int type){
        boolean isTheSameType = false;
        if (this.type==type){
            isTheSameType=true;
        }
        return isTheSameType;
    }
}
