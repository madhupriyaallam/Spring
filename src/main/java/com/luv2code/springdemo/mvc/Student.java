package com.luv2code.springdemo.mvc;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favouriteLanguage;
    private String[] operatingSystems;
    public Student(){}
    public String getFirstName(){return this.firstName;}
    public void setFirstName(String firstName){ this.firstName = firstName; }
    public String getLastName(){return this.lastName;}
    public void setLastName(String LastName){ this.lastName = lastName; }
    public String getCountry(){return this.country;}
    public void setCountry(String country){ this.country = country; }
    public String getFavouriteLanguage(){return this.favouriteLanguage;}
    public void setFavouriteLanguage(String favouriteLanguage){ this.favouriteLanguage = favouriteLanguage; }
    public String[] getOperatingSystems(){return this.operatingSystems;}
    // use reference jstl tag library in confirmation page to get the array of selected os
    public void setOperatingSystems(String[] operatingSystems){ this.operatingSystems = operatingSystems; }
}
