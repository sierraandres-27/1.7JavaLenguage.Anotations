package Exercise2_Nivel1;

public class InpersonWorker2 extends Worker2{


    protected static int petrol=50;


    public  InpersonWorker2(String name, String surname, double hourPrice){

        super(name,surname,hourPrice );



    }


    @Deprecated
    public void obsoletemethotinperson (){

        System.out.println("Deprecated methot");

    }



    public double calculateSalary(int hours){


        return (hours*hourprice)+petrol;




    }


}
