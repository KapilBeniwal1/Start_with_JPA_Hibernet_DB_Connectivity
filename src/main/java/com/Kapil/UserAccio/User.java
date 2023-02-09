package com.Kapil.UserAccio;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "User_Info") //if we want to change table name do with this
public class User {
    @Id
    private int id;
    private String name;
    private int mobileNo;
    private int age;

    public User(){

    }
    public User(int id, String name, int mobileNo,int age) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
