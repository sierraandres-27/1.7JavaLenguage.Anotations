package Exercise2_Nivel1;

public class Worker2 {


    protected String name;

    protected String surname;

    protected double hourprice;


    public Worker2(String name, String surname, double hourPrice) {

        this.name = name;

        this.surname = surname;

        this.hourprice = hourprice;

    }




    public double calculateSalary(int hours) {


        return hours * hourprice;

    }


}
