public class Hotel {
    private String name;
    private Room[] rooms;
    public Room[] availableRooms (int type, int budget){
        Room[] available;
        int counter =0;
        int index=0;
        for (int i = 0; i < this.rooms.length; i++){
            if (this.rooms[i].isAvailable()){
                if (this.rooms[i].isTheSameType(type)){
                    if (this.rooms[i].calculatePrice()<=budget){
                        counter++;
                    }
                }
            }
        }
        available=new Room[counter];
        for (int i = 0; i < this.rooms.length; i++){
            if (this.rooms[i].isAvailable()){
                if (this.rooms[i].isTheSameType(type)){
                    if (this.rooms[i].calculatePrice()<=budget){
                        available[index]=this.rooms[i];
                        index++;
                    }
                }
            }
        }
        return available;
    }

    public int income() {
        int sumOfIncome=0;
        for (int i = 0; i < this.rooms.length; i++){
            if (!this.rooms[i].isAvailable()){
                sumOfIncome+=this.rooms[i].calculatePrice();
            }
        }
        return sumOfIncome;
    }

    public String getName() {
        return name;
    }
}
