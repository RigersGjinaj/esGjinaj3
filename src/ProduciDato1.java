public class ProduciDato1 extends Thread{

    Semaforo pieno;
    Semaforo vuoto;
    int tanti=6;
    final int attesa = 500;

    public ProduciDato1(Semaforo s1,Semaforo s2){

        pieno=s1;
        vuoto=s2;
    }

    public void run(){
        int k=1;
        while(k<tanti){
            k*=2;
            vuoto.P();
            Prod.buffer=k;
            System.out.println("Scrittore dato scritto " + k);
            pieno.V();
            try {
                Thread.sleep(attesa);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }

        System.out.println("Scrittore termina scrittura dati");
        

    }
}
