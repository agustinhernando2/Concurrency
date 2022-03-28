import java.util.Date;
import task.Grupo;

public class Main {

    public static void main(String[] args) throws InterruptedException{

        Thread teapots=new Thread(new Grupo("Teapots"));
        Thread venThread=new Thread(new Grupo("VenThread"));
        Thread giA=new Thread(new Grupo("GiA"));

        teapots.start();
        teapots.join();

        venThread.start();
        venThread.join();

        giA.start();
        giA.join();


        //teapots.join();
        //venThread.join();
        //giA.join();


        System.out.printf("Main: Se finalizo la impresion de mensajes %s\n", new Date());
    }
}
