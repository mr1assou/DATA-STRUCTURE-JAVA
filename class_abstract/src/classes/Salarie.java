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
public abstract class Salarie {
    public String nom="inconnnu";
    public String prenom="inconnu";
    public double salaire=000;
    public Salarie(){
        System.out.println("an object created");
    }
    public Salarie(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String toString(){
        return " le nom est: "+nom+" le prenom est: "+prenom;
    }
    public double gains(){
        return salaire;
    }
}
