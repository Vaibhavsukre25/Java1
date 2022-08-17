package runall;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
public class IO6 {
	public static void main(String[] args) throws Exception{
		URL url=new URL("https://www.w3schools.com");
		
		URLConnection urlcon=url.openConnection();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
		FileOutputStream fos=new FileOutputStream("w3schools.html");
		int n=0;
		while((n=br.read())!=-1) {
			System.out.print((char)n);
			fos.write(n);
		}
		
	}

}
