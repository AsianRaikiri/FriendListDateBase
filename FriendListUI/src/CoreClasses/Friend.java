package CoreClasses;

import java.util.Date;

public class Friend {
    private int friend_ID;
    private String name;
    private String last_Name;
    private String sex;
    private Date birthDate;
    private int occupation_ID;
    private String address;
    private int vacation_Budget;
    private String future_Dream;
    public Friend(int friend_ID, String name, String last_Name, String sex, Date birthDate,
                  int occupation_ID, String address, int vacation_Budget, String future_Dream){
        super();
        this.friend_ID = friend_ID;
        this.name = name;
        this.last_Name = last_Name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.occupation_ID = occupation_ID;
        this.address = address;
        this.vacation_Budget = vacation_Budget;
        this.future_Dream = future_Dream;
    }
    public int getFriend_ID(){
        return this.friend_ID;
    }
    public void setFriend_ID(int newID){
        this.friend_ID = newID;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getLast_Name(){
        return this.last_Name;
    }
    public void setLast_Name(String newLast_Name){
        this.last_Name = newLast_Name;
    }
    public String getSex(){
        return this.sex;
    }
    public void setSex(String newSex){
        this.sex = newSex;
    }
    public Date getBirthDate(){
        return this.birthDate;
    }
    public void setBirthDate(Date newBirthDate){
        this.birthDate = newBirthDate;
    }
    public int getOccupation_ID(){
        return this.occupation_ID;
    }
    public void setOccupation_ID(int newOccupation){
        this.occupation_ID = newOccupation;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String newAddress){
        this.address = newAddress;
    }
    public int getVacation_Budget(){
        return this.vacation_Budget;
    }
    public void setVacation_Budget(int newVacation_Budget){
        this.vacation_Budget = newVacation_Budget;
    }
    public String getFuture_Dream(){
        return this.future_Dream;
    }
    public void setFuture_Dream(String newFuture_Dream){
        this.future_Dream = newFuture_Dream;
    }

}
