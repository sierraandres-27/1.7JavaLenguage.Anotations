package Exercise1_Nivel1;

public class Worker {



protected String name;

protected String surname;

protected double hourprice;


public Worker (String name,String surname, double hourPrice){

    this.name=name;

    this.surname=surname;

    this.hourprice=hourprice;

}




    public double calculateSalary (int hours){


    return hours*hourprice;




}


}
