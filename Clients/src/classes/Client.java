


package classes;

public class Client {
    private String cin;
    private String nom;
    private String prenom;
    private int telephone;
    public  Client(){
        cin="Jt102367";
        nom="Assou";
        prenom="Marwane";
        telephone=03263765; 
    }
    public  Client(String cin,String nom,String prenom,int telephone){
        this.cin=cin;
        this.nom=nom;
        this.prenom=prenom;
        this.telephone=telephone;
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

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    public void affichage(){
        System.out.println("nom:"+nom+"\nprenom:"+prenom+"\nnumeroTel:"+telephone+"\nCIN:"+cin);
    }
}



