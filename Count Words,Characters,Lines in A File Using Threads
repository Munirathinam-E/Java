package Haviya;

import java.io.FileReader;
import java.io.IOException;

class ThreadDemos1 extends Thread{
	public void run() {
	try {
		FileReader fr=new FileReader("addresss.txt");
		int ch=0,lineCount=1,wordCount=0;
		while((ch=fr.read())!=-1)
		{
			if((char)ch=='\n')
			{
				lineCount+=1;
			}
			if((char)ch==' ')
			{
				wordCount+=1;
			}
		}
		System.out.println("The file 'addresss.txt' has\n"+(wordCount+lineCount)+" Words\n");
		
	}catch(IOException e)
	{
		System.out.println(e);
	}

}
}
class ThreadDemos2 extends Thread{
	public void run() {
		try {
			FileReader fr=new FileReader("HomeWork.java");
			int ch=0,lineCount=1,wordCount=0;
			while((ch=fr.read())!=-1)
			{
				if((char)ch=='\n')
				{
					lineCount+=1;
				}
				if((char)ch==' ')
				{
					wordCount+=1;
				}
			}
			System.out.println("The file 'HomeWork.java' has\n"+(wordCount+lineCount)+" Words\n");
			
		}catch(IOException e)
		{
			System.out.println(e);
		}

}
}
class ThreadDemos3 extends Thread{
	public void run() {
		try {
			FileReader fr=new FileReader("report.txt");
			int ch=0,lineCount=1,wordCount=0;
			while((ch=fr.read())!=-1)
			{
				if((char)ch=='\n')
				{
					lineCount+=1;
				}
				if((char)ch==' ')
				{
					wordCount+=1;
				}
			}
			System.out.println("The file 'report.txt' has\n"+(wordCount+lineCount)+" Words\n");
			
		}catch(IOException e)
		{
			System.out.println(e);
		}

}
}
public class MyThread3 {
public static void main(String[] args) {
    ThreadDemos1 t1=new ThreadDemos1();
    t1.start();
    ThreadDemos2 t2=new ThreadDemos2();	
    t2.start();
    ThreadDemos3 t3=new ThreadDemos3();	
    t3.start();
}
}
