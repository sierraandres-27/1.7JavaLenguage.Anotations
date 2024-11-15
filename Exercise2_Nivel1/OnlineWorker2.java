package Exercise2_Nivel1;

public class OnlineWorker2 extends  Worker2{

    protected static final double internet=40;

    public OnlineWorker2 (String name, String surname, int hourPrice){


        super(name,surname,hourPrice);



    }

    @Deprecated
    public void obsoletemethotonline(){

        System.out.println("Deprecated methot");

    }



    @Override
    public double calculateSalary (int hours){

        return (hours*hourprice)+internet;


    }

}
