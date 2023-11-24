
package modele;

public class Avion extends Vehicule implements Designable
{
        public Avion() 
        {
            super();
        }
       public Avion(int km)
         {
              super(km);
         }

    @Override
    public void sedeplacer() {
        System.out.println("Avion vole ............");
        this.setKilometrage(this.getKilometrage()+100);
        System.out.println(this.getKilometrage() +" km");         
    }

    @Override
    public void description() {
        System.out.println("modele.Avion.description()");
    }
       
}
