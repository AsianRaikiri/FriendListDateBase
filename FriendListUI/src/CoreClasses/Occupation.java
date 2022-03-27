package CoreClasses;

public class Occupation {
    private int occupation_ID;
    private String occupation_Name;
    private String occupation_Description;
    private int occupation_Average_Salary;

    public Occupation(int occupation_ID, String occupation_Name, String occupation_Description,
                      int occupation_Average_Salary){
        super();
        this.occupation_ID = occupation_ID;
        this.occupation_Name = occupation_Name;
        this.occupation_Description = occupation_Description;
        this.occupation_Average_Salary = occupation_Average_Salary;
    }

    public int getOccupation_ID() {
        return this.occupation_ID;
    }
    public void setOccupation_ID(int newOccupation_ID){
        this.occupation_ID = newOccupation_ID;
    }
    public String getOccupation_Name(){
        return this.occupation_Name;
    }

    public void setOccupation_Name(String newOccupation_Name) {
        this.occupation_Name = newOccupation_Name;
    }
    public String getOccupation_Description(){
        return this.occupation_Description;
    }
    public void setOccupation_Description(String newOccupation_Description){
        this.occupation_Description = newOccupation_Description;
    }
    public int getOccupation_Average_Salary(){
        return this.occupation_Average_Salary;
    }

    public void setOccupation_Average_Salary(int newOccupation_Average_Salary) {
        this.occupation_Average_Salary = newOccupation_Average_Salary;
    }
}

