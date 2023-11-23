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
public class Compte {
    public static int count=0;
    private int solde=0;
    private int code;
    public Compte(Client client){
        count++;
        System.out.println("numero de compte "+count);
        System.out.println("solde: "+this.solde);
        System.out.println("proprietere de compte :");
        System.out.println("CIN: "+client.getCin());
        System.out.println("nom: "+client.getNom());
        System.out.println("prenom: "+client.getPrenom());
        System.out.println("Telephone: "+client.getTelephone());
    }
    
    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public void crediter(int amount){
          this.solde+=amount;
    }
    public void crediter(int amount,Compte compte){
        this.solde+=amount;  
        compte.solde-=amount;
    }
    public void debiter(int amount){
          this.solde-=amount;
    }
    public void debiter(int amount,Compte compte){
        this.solde-=amount;  
        compte.solde+=amount;
    }
    public void numberofaccounts(){
        System.out.println("number of accounts is :"+count);
    }
    public void resume(Client client){
        System.out.println("numero de compte "+count);
        System.out.println("solde: "+this.solde);
        System.out.println("proprietere de compte :");
        System.out.println("CIN: "+client.getCin());
        System.out.println("nom: "+client.getNom());
        System.out.println("prenom: "+client.getPrenom());
        System.out.println("Telephone: "+client.getTelephone());
    }
}
