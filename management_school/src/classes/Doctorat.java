/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

public  class Doctorat extends Personne implements IProf,IEtudiant{
    private int numeroInscription;
    private int nbreAbsences;
    public int matricule;
    public int nombreHeureSup;
    public double tauxHoraire;
    public Doctorat(String cin,String nom,String prenom,int numeroInscription,int nbreAbsences,int  matricule,int nombreHeureSup,double tauxHoraire){
         super(cin,nom,prenom);
        this.numeroInscription=numeroInscription;
        this.nbreAbsences=nbreAbsences;
        this.matricule=matricule;
        this.nombreHeureSup=nombreHeureSup;
        this.tauxHoraire=tauxHoraire;  
    }
    public void afficher() {
        System.out.println("CIN: " + getCin());
        System.out.println("Nom: " + getNom());
        System.out.println("Prenom: " + getPrenom());
        System.out.println("Numero d'Inscription: " + numeroInscription);
        System.out.println("Absences: " + nbreAbsences);
        System.out.println("Matricule: " + matricule);
        System.out.println("Nombre Heures Sup: " + nombreHeureSup);
        System.out.println("Taux Horaire: " + tauxHoraire);
    }
    public void absence(){
        nbreAbsences++;
    }
    public double calculeSalaire(){
        return 0;
    }
}
