package com.galvanize;

import com.galvanize.Address;

import java.util.List;

interface Addressable {
  List<Address> getAddresses();
  void addAddress(Address newValue);
}
