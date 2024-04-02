package Haviya;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class OccurenceOfCharacters {
	public static void count()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name:");
		String name=sc.next();
		try {
		FileInputStream fis=new FileInputStream(name);
		int ch=0;
		int[] count=new int[256];
		while((ch=fis.read())!=-1)
		{
			if(Character.isLowerCase(((char)ch))) {
				ch=ch-32;
			}
			count[ch]++;
		}
		for(int i=65;i<=90;i++)
		{
			System.out.println("The "+(char)i+" count:"+count[i]);
		}
		}catch(FileNotFoundException e)
		{
			System.out.println(e);
		}catch(IOException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	count();
}
}
