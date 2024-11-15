package Exercise1_Nivel1;

public class OnlineWorker extends Worker {


    protected static final double internet=40;

    public OnlineWorker (String name, String surname, int hourPrice){


        super(name,surname,hourPrice);



    }
    @Override
    public double calculateSalary (int hours){

        return (hours*hourprice)+internet;


    }




}
