package Haviya;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
public static void main(String[] args)throws IOException {
	File in=new File("input.txt");
	File out=new File("output1.txt");
	FileReader fr=new FileReader(in);
	FileWriter fw=new FileWriter(out);
	int c=0;
	while((c=fr.read())!=-1) {
		fw.write((char)c);
		System.out.print((char)c);
	}
	fr.close();
	fw.close();
}
}
