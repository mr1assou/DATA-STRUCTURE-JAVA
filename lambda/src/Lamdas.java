/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marwa
 */
public class Lamdas {
    public static void main(String[] args){
//        Cat myCat=new Cat();
        printThing(name->{System.out.println("Meow from lambda "+name);});
    }
    public static void printThing(Printable thing){
        thing.print("Marwane");
    }
}
