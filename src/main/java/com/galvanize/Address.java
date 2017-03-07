package com.galvanize;

public class Address
{

  private String street;
  private String city;
  private String state;
  private String zip;

  public Address(String street, String city, String state, String zip){
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

  public String getStreet(){
    return street;
  }

  public void setStreet(String s){
    street = s;
  }

  public String getCity(){
    return city;
  }

  public void setCity(String c){
    city = c;
  }

  public String getState(){
    return state;
  }

  public void setState(String s){
    state = s;
  }

  public String getZip(){
    return zip;
  }

  public void setZip(String z){
    zip = z;
  }

  @Override
  public String toString(){
    return street + ", " + city + ", " + state + " " + zip;
  }
}
