package Haviya;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadScore {
	public static void read()
	{
		Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter the FileName:");
		String str=sc.next();
		FileReader fr=new FileReader(str);
		BufferedReader bis=new BufferedReader(fr);
		String s;
		int total=0,c=0;
		System.out.println("Name:"+bis.readLine());
		while((s=bis.readLine())!= null)
		{
			total+=(Integer.parseInt(s));
			c+=1;
		}
		System.out.println("Total:"+total+" \nAverage:"+total/c);
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	sc.close();
}

public static void main(String[] args) {
	read();
}
}
