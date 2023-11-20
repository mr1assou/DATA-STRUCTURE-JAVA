package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class BankAccount {
    private int solde;
    private int number;
    private String name;
    private String type;
    // constructor    
    public BankAccount(int solde,int number,String name,String type){
        this.solde=solde;
        this.type=type;
        this.number=number;
        this.name=name;
        this.type=type;
    }
    public void deposit(int amount){
        this.solde+=amount;
    }
    public void retirer(int amount){
        this.solde-=amount;
    }
    // setters and getters

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
