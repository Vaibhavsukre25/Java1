package ch6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class IO1 {
	public static void main(String[] args) throws Exception {
		
		
		File file = new File("IO.txt");
		System.out.println(file.canExecute());
		System.out.println(file.canRead()+":"+file.canWrite());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		file.renameTo(new File("IO.txt"));
		//FileInputStream fis = new FileInputStream(file);
		//FileReader fr = new FileReader(file);
		
	}

}
