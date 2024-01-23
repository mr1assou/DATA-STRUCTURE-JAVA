




import classes.Etudiant;
import classes.Doctorat;
import classes.Professeur;
import classes.Personne;
public class Main {
    public static void main(String[] args){
        Personne array[]={new Etudiant("Jt102367","Marwane","Assou",1,0),new Professeur("eyzt","ali","wjdi",12,10,9,8)
        ,new Doctorat("xxxx","zakaria","tbatou",30,0,44,5,2)};
        for(Personne item:array){
            item.afficher();
            System.out.println();
        }
    }
}
