package task;
public class Grupo implements Runnable {

	 String mensaje;

	 public Grupo(String nombre){

	       mensaje = "Hola, somos el grupo " + nombre + " y este es nuestro mensaje numero: ";

	 }
 	@Override
	 public void run(){
			// TODO Auto-generated method stub

	       for (int i=1; i<100;i++){
	                       String msj = mensaje + i;
	                       System.out.println(msj);
	                       
	                      
	                       
	       }
		   
	 }

}
