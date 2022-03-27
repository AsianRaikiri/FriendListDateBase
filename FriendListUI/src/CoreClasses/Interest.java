package CoreClasses;

public class Interest {
    private int interest_ID;
    private String interest_Name;
    private String interest_Description;

    public Interest(int interest_ID, String interest_Name, String interest_Description){
        super();
        this.interest_ID = interest_ID;
        this.interest_Name = interest_Name;
        this.interest_Description = interest_Description;
    }
    public int getInterest_ID(){
        return this.interest_ID;
    }
    public void setInterest_ID(int newInterest_ID){
        this.interest_ID = newInterest_ID;
    }
    public String getInterest_Name(){
        return this.interest_Name;
    }
    public void setInterest_Name(String newInterest_Name){
        this.interest_Name = newInterest_Name;
    }
    public String getInterest_Description(){
        return this.interest_Description;
    }
    public void setInterest_Description(String newInterest_Description){
        this.interest_Description = newInterest_Description;
    }
}
