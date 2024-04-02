package Haviya;

class Stock{
	public synchronized void putStock(){
		notify();
		System.out.println("Put method is called");
	}
	public synchronized void getStock() throws InterruptedException{
		wait(5000);
		System.out.println("Get method is called");
	}
}
class Producer extends Thread{
	public void run(){
	Stock s1=new Stock();
	s1.putStock();
	}
}
class Consumer extends Thread{
	public void run(){
	Stock s1=new Stock();
	try {
		s1.getStock();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
}
public class MyThread {
public static void main(String[] args) throws InterruptedException {
	Producer t1=new Producer();
	t1.start();
	Consumer t2=new Consumer();
	t2.start();
}
}
