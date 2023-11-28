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
public class Patron extends Salarie{
    private double salaire_mensuel=00;
    public Patron(){
        System.out.println("Hello i am the boss");
    }
    public Patron(String nom,String prenom,double salaire){
        super(nom,prenom);
        this.salaire=salaire;
    }
    public String toString(){
        return "le nom du patron est: "+this.nom+"et le prenom est: "+prenom+"le salaire de patron est: "+salaire;
    }
    public double gains(){
        return salaire;
    }
}
