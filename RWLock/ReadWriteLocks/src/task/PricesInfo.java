package task;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * This class simulates the store of two prices. We will
 * have a writer that stores the prices and readers that 
 * consult this prices
 *
 */
public class PricesInfo {

	private double price1;
	private double price2;
	private ReadWriteLock lock; // para tener lock de W/R
	
	/**
	 * Constructor of the class. Initializes the prices and the Lock
	 */
	public PricesInfo(){
		price1=1.0;
		price2=2.0;
		lock=new ReentrantReadWriteLock();
	}

	/**
	 * Returns the first price
	 * @return the first price
	 */
	public double getPrice1() {
		lock.readLock().lock(); //bloqueo a escritores
		double value=price1;
		System.out.printf("Tiempo Lectura 1: %s, Hilo %s\n", System.currentTimeMillis(),Thread.currentThread().getName());
		lock.readLock().unlock(); //desbloqueo a escritores
		return value;
	}

	/**
	 * Returns the second price
	 * @return the second price
	 */
	public double getPrice2() {
		lock.readLock().lock();
		double value=price2;
		System.out.printf("Tiempo Lectura 2: %s, Hilo %s\n", System.currentTimeMillis(),Thread.currentThread().getName());
		lock.readLock().unlock();
		return value;
	}

	/**
	 * Establish the prices
	 * @param price1 The price of the first product
	 * @param price2 The price of the second product
	 */
	public void setPrices(double price1, double price2) {
		lock.writeLock().lock();
		this.price1=price1;
		this.price2=price2;
		try{
			Thread.sleep(2000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.printf("Tiempo escritura: %s, Hilo %s\n", System.currentTimeMillis(),Thread.currentThread().getName());
		lock.writeLock().unlock();
	}
}
