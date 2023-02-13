public class Child {
    private String name;
    private boolean isABoy;
    private int year;
    private int month;

    public boolean isOlder (Child fetus) {
        boolean isOlderIndeed =false;
        if (fetus.year<this.year) {
            isOlderIndeed = true;
        }else if (fetus.year==this.year){
                if (fetus.month<this.month){
                    isOlderIndeed=true;
            }
        }
        return isOlderIndeed;
    }

    public boolean isABoy() {
        return isABoy;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }
}
