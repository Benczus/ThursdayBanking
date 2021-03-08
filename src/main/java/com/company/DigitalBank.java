package com.company;

import java.util.ArrayList;
import java.util.List;

public class DigitalBank implements Bank{
    private String name;
    private String ownerName;
    private List<Account> accountList;

    public DigitalBank(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
        this.accountList = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
    this.name=name;
    }

    @Override
    public String getOwnerName() {
        return this.ownerName;
    }

    @Override
    public void setOwnerName(String ownerName) {
        this.ownerName=ownerName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    @Override
    public void register(Account account) {
        this.accountList.add(account);
    }
}
