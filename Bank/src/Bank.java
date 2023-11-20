



import model.BankAccount;
import model.Person;

public class Bank {
    public static void main(String[] args){
        BankAccount account1=new BankAccount(2000,2333,"Marwane_account1","courant");
        BankAccount account2=new BankAccount(0,2444,"Marwane_account2","bloque");
        BankAccount account3=new BankAccount(0,2121,"Marwane_account3","bloque");
        Person person1=new Person("Marwane",20,"Jt102367","Homme",913,account1,account2,account3);
        for(int i=0;i<person1.accounts.length;i++){
            System.out.println(person1.accounts[i].getName());
            System.out.println(person1.accounts[i].getNumber());
            System.out.println(person1.accounts[i].getSolde());
            System.out.println(person1.accounts[i].getType());
        }
    }
}
