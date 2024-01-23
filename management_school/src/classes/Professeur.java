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
public class Professeur extends Personne implements IProf{
    public int matricule;
    public int nombreHeureSup;
    public double tauxHoraire;
    public double salaireFixe;
    public Professeur(String cin,String nom,String prenom,int matricule,int nombreHeureSup,double tauxHoraire,double salaireFixe){
        super(cin,nom,prenom);
        this.matricule=matricule;
        this.nombreHeureSup=nombreHeureSup;
        this.tauxHoraire=tauxHoraire;
        this.salaireFixe=salaireFixe;
    }
     public void afficher(){
        System.out.println("cin:"+cin+" nom:"+nom+" prenom: "+prenom +" matricule :"+matricule+ "nombreHeureSup: "+nombreHeureSup+" tauxHoraire: "+tauxHoraire+" salaireFixe "+salaireFixe);
    }
     public double calculeSalaire(){
         return salaireFixe + nombreHeureSup* tauxHoraire;
     }
}
