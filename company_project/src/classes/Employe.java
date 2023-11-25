/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author marwa
 */
public class Employe {
    protected String nom="undefined";
    protected int age=0;
    protected double salary=0;
    public Employe(){
        System.out.printf("emty constructor\n");
    }
    public Employe(String nom,int age,double salary){
        this.nom=nom;
        this.age=age;
        this.salary=salary;
    }
    public void augmentation(double aug){
        salary+=aug;
    }
    public void afficher(){
        System.out.println("nom: " +nom+" age "+" salary: " +salary);
    }
    public String toString(){
        return nom+"--"+salary;
    }
    public double calculSalaire(){
        return salary;
    }
}
