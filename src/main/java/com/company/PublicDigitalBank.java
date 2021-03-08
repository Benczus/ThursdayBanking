package com.company;

import java.util.UUID;

public class PublicDigitalBank extends DigitalBank{

    private UUID id;

    public PublicDigitalBank(String name, String ownerName, UUID id) {
        super(name, ownerName);
        this.id = id;
    }

    public PublicDigitalBank(String name, String ownerName) {
        super(name, ownerName);
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public boolean authernticate(String name, String password){
        for (Account account:this.getAccountList()){
            if(account.getName().equals(name) && (account.getPassword().equals(password)))
                return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return super.getName() + "Public Digital Bank";
    }
}
