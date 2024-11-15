package Exercise1_Nivel1;

public class Main {

    public static void main(String[] args) {

        Worker first =new OnlineWorker("Marcos","Serrat",20);

        Worker second =new InpersonWorker("Antono","Arjon",23);

        System.out.println("The salary of the first worker is: "+first.calculateSalary(40)+", and the salary os the second worker is: "+second.calculateSalary(46));


        

    }
}
