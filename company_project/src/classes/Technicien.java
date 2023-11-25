


package classes;

public class Technicien extends Employe{
    private int grade;
    private int prime;
    public Technicien(String nom,int age,int salary,int grade){
        super(nom,age,salary);
        this.grade=grade;
    }
    public void prime(){
        if(grade==1){
            prime=100;
            System.out.printf("your prime is 100");
        }
        else if(grade==2){
            prime=200;
            System.out.printf("your prime is 200");
        }
        else{
            prime=300;
            System.out.printf("your prime is 300");
        }
    }
    public String toString(){
        return nom+"--"+salary;
    }
    public double calculSalaire(){
        return salary + prime;
    }
}
