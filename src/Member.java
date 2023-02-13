public class Member {
    private String firstName;
    private String lastName;
    private Team memberOf;
    private String descriptionOfRole;
    private int yearsInCompany;
    private int yearsInIndustry;
    private String id;
    public boolean isSenior () {
        boolean isSeniorIndeed=false;
        if (this.yearsInCompany>=3 || this.yearsInIndustry>=5){
            isSeniorIndeed=true;
        }
        return isSeniorIndeed;
    }

public boolean isHeadOfTeam(){
    boolean isHeadOfTeam= false;
    if (this.memberOf.getHeadOfTeam().id.equals(this.id)){
        isHeadOfTeam= true;
    }
    return isHeadOfTeam;
}
}
