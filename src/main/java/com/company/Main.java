package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank= new DigitalBank("Dagobert", "McDuck Industries");
        DigitalBank digitalBank = new DigitalBank("valami", "valami");
        DigitalBank digitalBank1 = new PublicDigitalBank("Something", "Something");
        PublicDigitalBank publicDigitalBank = new PublicDigitalBank("Cica", "kutya");

        System.out.println(bank.getName());
        System.out.println(digitalBank.getName());
        System.out.println(digitalBank1.getName());

        System.out.println(publicDigitalBank.getName());
    }
}
