
package modele;
public abstract class Vehicule
{
    //***********************************************
      private int kilometrage;
      //************************************************************
      public Vehicule()
      {    this.kilometrage=0;    }
      public Vehicule(int km)
      {
          this.kilometrage=km;
      }
     //*****************************************************************************************
        public int getKilometrage() {        return kilometrage;    }
        public void setKilometrage(int kilometrage) {   this.kilometrage = kilometrage;   }
      
    //************************************************************************************ 
      public void demarrer()
      {
          System.out.println("le vehicule vient de démarrer!!!!!");
      }          
      public abstract  void sedeplacer();
      
}
