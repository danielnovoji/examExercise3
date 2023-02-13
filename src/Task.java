public class Task {
    private String descriptionOfTask;
    private Member inChargeOfTask;
    private int status;
    private static final int NOT_YET_DONE =0;
    private static final int IN_PROGRESS=1;
    private static final int COMPLETE=2;
    private int taskType;
    private static final int BUG=1;
    private static final int CHECK=2;
    private static final int CONFIGURATION=3;
    private static final int GENERAL_DEVELOPMENT=4;

    public boolean isComplete() {
        boolean isCompleteIndeed=false;
        if (this.status==COMPLETE){
            isCompleteIndeed=true;
        }
        return isCompleteIndeed;
    }

    public Member getInChargeOfTask() {
        return inChargeOfTask;
    }
}
