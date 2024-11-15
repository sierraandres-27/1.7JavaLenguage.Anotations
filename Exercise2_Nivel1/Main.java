package Exercise2_Nivel1;

public class Main {

    @SuppressWarnings("deprecation")

    public static void main(String[] args) {

        InpersonWorker2 example1=new InpersonWorker2("Raul","Rodriguez",30);

        OnlineWorker2 example2=new OnlineWorker2("Monica","Naranjo", 98);



        example1.obsoletemethotinperson();
        example2.obsoletemethotonline();

    }



}
