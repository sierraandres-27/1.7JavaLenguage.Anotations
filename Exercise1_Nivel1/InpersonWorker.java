package Exercise1_Nivel1;

public class InpersonWorker extends Worker {



    protected static int petrol=50;


public  InpersonWorker(String name, String surname, double hourPrice){

    super(name,surname,hourPrice );



}



public double calculateSalary(int hours){


return (hours*hourprice)+petrol;




}

}
