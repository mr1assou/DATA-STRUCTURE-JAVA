/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

public  class Voiture extends Vehicule implements Designable{

    
           public Voiture()
           {super();}
           
       public Voiture(int distance)
       {
           super(distance);
       }
       
    @Override
    public void sedeplacer() {
        System.out.println("Voiture roule .........");
        this.setKilometrage(this.getKilometrage()+1);
         System.out.println(this.getKilometrage() +" km");
    }

    @Override
    public void description() {
        System.out.println("modele.Voiture.description()");        
    }
       
}
