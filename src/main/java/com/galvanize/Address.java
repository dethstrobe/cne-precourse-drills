package com.galvanize;

import java.util.*;

public class Address {
  private String street;
  private String city;
  private String state;
  private String zip;

  @Override public String toString() {
    StringBuilder result = new StringBuilder();

    result.append(street + ", " + city + ", " + state +" " + zip);
    return result.toString();
  }

  public Address(String streetUpdated, String cityUpdated, String stateUpdated, String zipUpdated) {
    street = streetUpdated;
    city = cityUpdated;
    state = stateUpdated;
    zip = zipUpdated;
  }

  public String getStreet() {
    return street;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public String getZip() {
    return zip;
  }

  public void setStreet(String newStreet) {
    street = newStreet;
  }

  public void setCity(String newCity) {
    city = newCity;
  }

  public void setState(String newState) {
    state = newState;
  }

  public void setZip(String newZip) {
    zip = newZip;
  }
}