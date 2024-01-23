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
public class Etudiant extends Personne{
    private int numeroInscription;
    private int nbreAbsences;
    public Etudiant(String cin,String nom,String prenom,int numeroInscription,int nbreAbsences){
        super(cin,nom,prenom);
        this.numeroInscription=numeroInscription;
        this.nbreAbsences=nbreAbsences;
    }
    public void afficher(){
        System.out.println("cin:"+cin+" nom:"+nom+" prenom: "+prenom+" numeroInscription:"+numeroInscription+"nbreAbsences: "+nbreAbsences);
    }
    public void absence(){
        nbreAbsences++;
    }
}
