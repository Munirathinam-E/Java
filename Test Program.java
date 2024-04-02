package Haviya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Test {
public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(InputStreamReader(System.in));
	char ch;
	do {
		ch=(char)br.read();
		System.out.println(ch);	
	}while(ch!='q');


}

private static Reader InputStreamReader(InputStream in) {
	// TODO Auto-generated method stub
	return null;
}

}
