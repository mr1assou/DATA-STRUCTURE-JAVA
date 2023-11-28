




package classes;

public class TravailleurCommission extends Salarie{
    public double commission=0;
    public int quantité=0;
    public double salaire_mensuel=0;
public TravailleurCommission(){
        System.out.println("an object Travailleur commission create");
}
public TravailleurCommission(String nom,String prenom,double salaire,double commission){
    super(nom,prenom);
    this.commission=commission;
    this.salaire_mensuel=salaire;
    }
public String toString(){
    return "la commision du travailleur:"+nom+" "+prenom+"est "+commission;
}
public double gains(){
    return salaire_mensuel;
}
}
