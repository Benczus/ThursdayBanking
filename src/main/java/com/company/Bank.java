package com.company;

public interface Bank {


    public String getName();

    public void setName(String name);

    public String getOwnerName();

    public void setOwnerName(String ownerName);

    public void register(Account account);
}
