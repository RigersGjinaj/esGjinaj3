public class ConsumaDato extends Thread{

    Semaforo pieno;
    Semaforo vuoto;
    int dato;

    public ConsumaDato(Semaforo s1,Semaforo s2){
        setName("paperino");
        pieno=s1;
        vuoto=s2;


    }

    public void run(){

        while(true){
            pieno.P();

            dato=Prod.buffer;
            System.out.println("Lettore dato letto " +dato);
            System.out.println("Questo consumatore è  " +getName());
            vuoto.V();

        }

    }
    
}
