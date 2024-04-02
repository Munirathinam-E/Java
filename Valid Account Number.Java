package Haviya;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AccountNumber {
	public static void accountDemo(){
	try {
		FileReader fr=new FileReader("account.txt");
		FileWriter fw=new FileWriter("validaccountnumber.txt");
		BufferedReader bis=new BufferedReader(fr);
		BufferedWriter bos=new BufferedWriter(fw);
		String str;
		int last=0,num=0,sum=0;
		//long num=0;
		while((str=bis.readLine())!= null)
		{
			sum=0;
			last=0;
			num=Integer.parseInt(str);
			last=num%10;
			num=num/10;
			while(num!=0)
			{
				sum+=(num%10);
				num=num/10;
			}
			if(last==sum/10)
			{
				bos.write(str);
				bos.newLine();
			}
			
			
		}
		bis.close();
		bos.close();
		
		}
	catch(IOException e)
	{
		System.out.println(e);
	}
}

public static void main(String[] args) {
	accountDemo();
}
}
