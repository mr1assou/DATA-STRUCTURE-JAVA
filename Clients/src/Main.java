




import classes.Client;
import classes.Compte;
public class Main {
    public static void main(String[] args){
        Client client=new Client("Jt102367","Marwane","Assou",723673);
        Compte compte=new Compte(client);
        compte.crediter(5000);
        compte.resume(client);
        compte.debiter(1000);
        compte.resume(client);
    }
}
