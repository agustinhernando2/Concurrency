package tarea;

public abstract class Tarea implements Runnable{
    protected static int y1=0,y2=0; //static define que estos atributos son unicos para todas las instancias
    protected static int critical=0;
    protected static int cantidad=0;
}
