package com.galvanize;

import java.util.*;

public class Business implements Addressable
{
    private final String name;
    private final List<Address> addresses;

    public Business(String n){
      name = n;
      addresses = new ArrayList<Address>();
    }

    public String getName(){
      return name;
    }

    @Override
    public List<Address> getAddresses(){
      return addresses;
    }

    @Override
    public void addAddress(Address A){
      addresses.add(A);
    }


}
