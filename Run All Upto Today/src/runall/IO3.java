package runall;

import java.io.FileReader;
import java.io.FileWriter;

public class IO3 {
	public static void main(String[] args) throws Exception{
		FileReader in=new FileReader("abc.txt");
		FileWriter out=new FileWriter("copy.txt");
		
		int n=0;
		char c[]=new char[8];
		while((n=in.read(c))!=-1) {
			String s=new String(c,0,n);
			out.write(s);
		}
		
		out.close();//this is mandatory
	}
}
