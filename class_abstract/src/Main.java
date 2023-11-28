/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marwa
 */
import classes.Salarie;
import classes.Patron;
import classes.TravailleHoraire;
import classes.TravailleurCommission;
public class Main {
    public static void main(String[] args){
        Salarie [] salarieArray=new Salarie[3];
        salarieArray[0]=new Patron("Marwane","Assou",4000);
        salarieArray[1]=new TravailleHoraire("Ahmed","Khalid",200,2000);
        salarieArray[2]=new TravailleurCommission("alae","youssef",4000,1);
        int s=0;
        for(int i=0;i<salarieArray.length;i++){
            s+=salarieArray[i].gains();
        }
        System.out.println("la somme de salarie est: "+s);
    }
}
