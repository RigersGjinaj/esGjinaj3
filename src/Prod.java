public class Prod {

    protected static int buffer;

    public static void main(String[] args) {

        Semaforo pieno =new Semaforo(0);
        Semaforo vuoto =new Semaforo(1);
        
        ProduciDato prod=new ProduciDato(pieno, vuoto);
        ConsumaDato cons=new ConsumaDato(pieno, vuoto);
        ProduciDato1 prod1=new ProduciDato1(pieno, vuoto);
        ConsumaDato1 cons1=new ConsumaDato1(pieno, vuoto);

        prod.start();
        cons.start();
        prod1.start();
        cons1.start();

        System.out.println("Main termine avvio thread");

    }
    
}
