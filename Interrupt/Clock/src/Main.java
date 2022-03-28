import task.ConsoleClock;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ConsoleClock clock = new ConsoleClock();
        Thread tr = new Thread(clock);

        tr.start();

        try {
        TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        tr.interrupt();
    }
}
