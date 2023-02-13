public class Main {
    public void sameYearBoysAndGirls(Child[] children, int year) {
        int boyCounter =0;
        int girlCounter =0;
        for (int i = 0; i < children.length; i++){
         if (children[i].getYear()==year){
             if (children[i].isABoy()){
                 boyCounter++;
             } else {
                 girlCounter++;
             }
         }
        }
        System.out.println("Boys: " + boyCounter + "\n" + "Girls: " +girlCounter);
    }
    public void popularMonthForBoysAndGirls (Child[] children) {
        int [] boyMonth = new int[12];
        int [] girlMonth = new int[12];
        int boyIndex=0;
        int girlIndex=0;
        int boyMax =0;
        int girlMax =0;

        for (int i = 0 ; i < children.length; i++) { // [1,12,11,9]
            if (children[i].isABoy()){
                boyMonth[children[i].getMonth()-1]++;
            } else {
                girlMonth[children[i].getMonth()-1]++;
            }
        }
        for (int i = 0 ; i < boyMonth.length; i++){
            if (boyMax<boyMonth[i]){
                boyMax=boyMonth[i];
                boyIndex=i;
            }
        }
        for (int i = 0; i < girlMonth.length; i++){
            if (girlMax<girlMonth[i]){
                girlMax=girlMonth[i];
                girlIndex=i;
            }
        }
        System.out.println((girlIndex+1) + (boyIndex+1));

    }

    public int ageAverage (Child[] children){
        int result =0;
        int boyCounter=0;
        int girlCounter=0;
        int boySum =0;
        int girlSum=0;
        for (int i =0; i< children.length; i++){
            if (children[i].isABoy()){
                boyCounter++;
                boySum+=children[i].getYear();
            } else {
                girlCounter++;
                girlSum+=children[i].getYear();
            }
        }
        boySum/=boyCounter;
        girlSum/=girlCounter;
        if (boySum<girlSum){
            result=1;
        } else {
            result=-1;
        }
        return result;
    }





    public static Member mostProductiveMember (Task[] allTasks){
    allTasks=completedTasks(allTasks);
    int counter =0;
    int max=0;
    Member mostProductive = null;
    for (int i =0; i < allTasks.length; i++){
        counter=0;
    for (int j = i+1; j < allTasks.length; j++){
        if (!allTasks[i].getInChargeOfTask().isHeadOfTeam()){
            if (allTasks[i].getInChargeOfTask()==allTasks[j].getInChargeOfTask()){
                counter++;
            }
        }
    }
    if (max<counter){
        max=counter;
        mostProductive=allTasks[i].getInChargeOfTask();
    }
    }
    return mostProductive;
    }



    public static Task[] completedTasks (Task[] allTasks){
        int counter =0;
        int index=0;
        Task[] completed;
        for (int i = 0; i< allTasks.length; i++){
            if (allTasks[i].isComplete()){
                counter++;
            }
        }
        completed=new Task[counter];
        for (int i=0;i< allTasks.length;i++){
            if (allTasks[i].isComplete()){
                completed[index]=allTasks[i];
                index++;
            }
        }
        return completed;
    }



    public String mostProfitable(Hotel[] hotels){
    int max =1;
    String nameOfHotel="";
    for (int i = 0; i < hotels.length; i++){
        if (max<hotels[i].income()){
            max=hotels[i].income();
            nameOfHotel=hotels[i].getName();
        }
    }
    return nameOfHotel;
    }






















}