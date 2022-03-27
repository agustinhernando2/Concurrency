import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import tarea.calculator;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Minimum Priority: %s\n",
                Thread.MIN_PRIORITY);
        System.out.printf("Normal Priority: %s\n",
                Thread.NORM_PRIORITY);
        System.out.printf("Maximum Priority: %s\n",
                Thread.MAX_PRIORITY);

        int CANT = 20;
        Thread threads[];
        Thread.State status[];
        threads = new Thread[CANT];
        status = new Thread.State[CANT];

        for (int i = 0; i < CANT; i++) {
            threads[i] = new Thread(new calculator());
            if ((i % 2) == 0) {
                threads[i].setPriority(Thread.MAX_PRIORITY);
            } else {
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
            threads[i].setName("My Thread " + i);
        }

        try (FileWriter file = new FileWriter(".\\data\\log.txt");
             PrintWriter pw = new PrintWriter(file);) {
            for (int i = 0; i < CANT; i++) {
                pw.println("Main : Status of Thread " + i + " : " +
                        threads[i].getState());
                status[i] = threads[i].getState();
            }
            for (int i = 0; i < CANT; i++) {
                threads[i].start();
                System.out.println("Ha iniciado el hilo: "+ threads[i].getName());
            }

            boolean finish = false;
            while (!finish) {
                for (int i = 0; i < CANT; i++) {
                    if (threads[i].getState() != status[i]) {
                        writeThreadInfo(pw, threads[i], status[i]);
                        status[i] = threads[i].getState();
                    }
                }
                finish = true;
                for (int i = 0; i < CANT; i++) {
                    finish = finish && (threads[i].getState() == Thread.State.TERMINATED);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void writeThreadInfo(PrintWriter pw,Thread thread,Thread.State state) {
        pw.printf("Main : Id %d - %s\n", thread.getId(),
                thread.getName());
        pw.printf("Main : Priority: %d\n", thread.getPriority());
        pw.printf("Main : Old State: %s\n", state);
        pw.printf("Main : New State: %s\n", thread.getState());
        pw.printf("Main : ************************************\n");
    }
}
