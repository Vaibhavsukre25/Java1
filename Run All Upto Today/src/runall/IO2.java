package runall;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IO2 {
	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("abc.txt");
		FileOutputStream fos=new FileOutputStream("copy.txt");
		int n=0;
		byte b[]=new byte[8];
		while((n=fis.read(b))!=-1) {
			String str=new String(b,0,n);
			System.out.println(str);
			
			fos.write(b,0,n);
		}
	}

}
