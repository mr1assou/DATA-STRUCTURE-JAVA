/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marwa
 */
import classes.Employe;
import classes.Technicien;
public class Main {
    public static void main(String[] args){
        Employe obj_emp=new Employe("Hamza",19,100);
        Employe obj_Tech=new Technicien("Marwane",19,200,100);
        System.out.println(obj_Tech.toString());
        System.out.println(obj_emp.toString());
        obj_emp.augmentation(4000);
        obj_Tech.augmentation(1000);
        System.out.println(obj_Tech.toString());
        System.out.println(obj_emp.toString());
    }
}
