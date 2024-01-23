/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public abstract class Personne {
       protected String cin;
       protected String nom;
       protected String prenom;
       public Personne(){
           System.out.println("object personne created");
       }
       public Personne(String cin,String nom,String prenom){
           this.cin=cin;
           this.nom=nom;
           this.prenom=prenom;
       }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
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
    public void afficher(){
        System.out.println("cin:"+cin+" nom:"+nom+" prenom: "+prenom);
    }
}
