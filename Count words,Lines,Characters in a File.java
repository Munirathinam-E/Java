package Haviya;

import java.io.FileReader;
import java.io.IOException;

public class CountLineWordChar {
	public static void count()
	{
		try {
			FileReader fr=new FileReader("input.txt");
			int ch=0,lineCount=1,wordCount=0,charCount=0;
			while((ch=fr.read())!=-1)
			{
				charCount+=1;
				if((char)ch=='\n')
				{
					lineCount+=1;
				}
				if((char)ch==' ')
				{
					wordCount+=1;
				}
			}
			System.out.println("The file 'input.txt' has\n"+lineCount+" Lines\n"+(wordCount+lineCount)+" Words\n"+charCount+" Character");
			
		}catch(IOException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	count();
}
}
