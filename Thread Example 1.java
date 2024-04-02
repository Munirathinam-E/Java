package Haviya;

class MyThread implements Runnable {
 
	private static int sum=0;
	
 public void run()
 {
	 sum+=1;
	 System.out.println(" Sum:"+sum);
	 
 }
public static void main(String[] args) {
	for(int i=0;i<10;i++)
	{
		MyThread t=new MyThread();
		Thread t1=new Thread(t);
		t1.start();
		
	}
}
}
