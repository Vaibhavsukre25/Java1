package runall;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IO1 {

	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("abc.txt");
		FileOutputStream fos=new FileOutputStream("copy.txt");
		int n=fis.read();
		System.out.println((char)n);
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println(fis.read());
		
		fis=new FileInputStream("abc.txt");
		n=0;
		while((n=fis.read())!=-1) {
			System.out.println((char)n);
			fos.write(n);
		}
	}
}
