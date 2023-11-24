
package testing;
import modele.Avion;
import modele.Vehicule;
import modele.Voiture;
public class Test1 {  
    public static void main(String[] args)
    {
       Vehicule[] vehicules={new Voiture(),new Avion(80000) };
       for(Vehicule v: vehicules)
       {
             v.demarrer();
//             if (v.getClass().getSimpleName().equals("Voiture"))
//                ((Voiture)v).description();
//             if (v.getClass().getSimpleName().equals("Avion"))
//                 ((Avion)v).description();
             v.sedeplacer();
             v.sedeplacer();
             
             System.out.println("****************************");
       }
       
    }
    
}
