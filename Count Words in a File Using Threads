package Haviya;

import java.io.FileInputStream;
import java.io.IOException;

public class CountWordsUsingThreads extends Thread{
	public void run(String str) {
		try {
			FileInputStream fis=new FileInputStream(str);
			int ch=0,count=1;
			while((ch=fis.read())!=-1) {
				if(ch==' ')
					count+=1;
			}
			System.out.println(count);
		}catch(IOException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	Thread t1=new Thread();
	t1.start();
	Thread t2=new Thread();
	t2.start();
	Thread t3=new Thread();
	t3.start();
	
}
}
