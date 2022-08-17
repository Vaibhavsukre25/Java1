package ch6;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyCommand1 {
	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("IO.txt");
		FileOutputStream fos= new FileOutputStream("copy.txt");
		
		System.out.println(fis.available());
		int eof =-1;
		int n=0;
		byte b[] = new byte[4];
		while((n=fis.read(b))!=eof) {
			String s = new String(b,0,n);
			System.out.println(s);
			fos.write(b,0,n);
		}
		
	}

}
