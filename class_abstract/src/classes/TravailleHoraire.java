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
public class TravailleHoraire extends Salarie{
    public double retribution=0;
    public int heures=0;
    public TravailleHoraire(String nom,String prenom,double retribution,double salaire){
        super(nom,prenom);
        this.retribution=retribution;
        this.salaire=salaire;
    }
    public TravailleHoraire(){
        System.out.println("an Travalleur Horaire added");
    }
    public String toString(){
        return "le nom: "+nom+"le prenom: "+prenom+"retribution: "+retribution+"heures:"+heures;
    }
    public double gains(){
        return salaire;
    }
}
