

package model;

public class Person {
    private String namePerson;
    private int age;
    private String cin;
    private String sexe;
    private int numPhone;
    public BankAccount []accounts=new BankAccount[3];
    public Person(String namePerson,int age,String cin,String sexe,int numPhone,BankAccount account1,BankAccount account2,BankAccount account3){
        this.namePerson=namePerson;
        this.age=age;
        this.cin=cin;
        this.sexe=sexe;
        this.numPhone=numPhone;
        accounts[0]=account1;
        accounts[1]=account2;
        accounts[2]=account3;
    }
    public Person(BankAccount account1,BankAccount account2,BankAccount account3){}

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(int numPhone) {
        this.numPhone = numPhone;
    }

    public BankAccount[] getAccounts() {
        return accounts;
    }

    public void setAccounts(BankAccount[] accounts) {
        this.accounts = accounts;
    }
}
