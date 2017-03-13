package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable {
  private final String name;
  private final List<Address> addresses;

  public String getName(){
    return name;
  }

  public Business(String newName) {
    name = newName;
    addresses = new ArrayList();
  }

  public List<Address> getAddresses() {
    return addresses;
  };
  public void addAddress(Address newValue) {
    addresses.add(newValue);
  };
}