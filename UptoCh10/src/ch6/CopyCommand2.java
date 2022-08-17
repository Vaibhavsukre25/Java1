package ch6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyCommand2 {
	public static void main(String[] args) throws Exception{
	
		try(
	FileReader fis = new FileReader("IO.txt");
	FileWriter fos = new FileWriter("copy2.txt");
	){
		
		int eof =-1;
		int n=0;
		char b[] = new char[4];
		while((n=fis.read(b))!=eof) {
			String s = new String(b,0,n);
			System.out.println(s);
			fos.write(b,0,n);
		}
	}catch(Exception e) {e.printStackTrace();}
		//fos.close();
		
	}

}
