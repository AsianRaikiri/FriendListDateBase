package CoreClasses;

public class Hobby {
    private int hobby_ID;
    private String hobby_Name;
    private String hobby_Description;
    private int hobby_Monthly_Cost;
    public Hobby(int hobby_ID, String hobby_Name, String hobby_Description, int hobby_Monthly_Cost){
        super();
        this.hobby_ID = hobby_ID;
        this.hobby_Name = hobby_Name;
        this.hobby_Description = hobby_Description;
        this.hobby_Monthly_Cost = hobby_Monthly_Cost;
    }
    public int getHobby_ID(){
        return this.hobby_ID;
    }
    public void setHobby_ID(int newHobby_ID){
        this.hobby_ID = newHobby_ID;
    }
    public String getHobby_Name(){
        return this.hobby_Name;
    }
    public void setHobby_Name(String newHobby_Name){
        this.hobby_Name = newHobby_Name;
    }
    public String getHobby_Description(){
        return this.hobby_Description;
    }
    public void setHobby_Description(String newHobby_Description){
        this.hobby_Description = newHobby_Description;
    }
    public int getHobby_Monthly_Cost(){
        return this.hobby_Monthly_Cost;
    }
    public void setHobby_Monthly_Cost(int newHobby_Monthly_Cost){
        this.hobby_Monthly_Cost = newHobby_Monthly_Cost;
    }
}
