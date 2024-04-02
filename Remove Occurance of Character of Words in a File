package Haviya;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class RemoveOccurence {
	public static void remove()
	{
		
		try {
			FileInputStream fis=new FileInputStream("input.txt");
			int c=0;
			String str="";
			while((c=fis.read())!=-1) {
				str+=(char)c;
			}
			str=str.replace("Java", "C");
			FileWriter fw=new FileWriter("input.txt");
			fw.write(str);
			fis.close();
			fw.close();
		}catch(IOException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	remove();
}
}
