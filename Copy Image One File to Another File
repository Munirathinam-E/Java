package Haviya;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {
public static void main(String[] args) throws IOException{
	FileInputStream fis=new FileInputStream(args[0]);
	FileOutputStream fos=new FileOutputStream(args[1]);
	int i=0;
	do {
		i=fis.read();
		if(i!=-1)
			fos.write(i);
	}while(i!=-1);
	fis.close();
	fos.close();
}
}
