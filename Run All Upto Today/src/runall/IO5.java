package runall;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class IO5 {
	public static void main(String[] args)throws Exception {
		String s="jack &copy; and jill &cop went up the hill";
		
		ByteArrayInputStream bis=new ByteArrayInputStream(s.getBytes());
		
		BufferedInputStream bs=new BufferedInputStream(bis);
		
		int n=0;boolean mark=false;
		while((n=bs.read())!=-1) {
			switch((char)n) {
			case '&':{
				mark=true;
				bs.mark(30);
				break;
			}
			case ';':{
				mark=false;
				System.out.print((char)169);
				break;
			}
			case ' ':{
				if(mark) {
					bs.reset();
					System.out.print("&");
					mark=false;
				}
				else {
					System.out.print(" ");
					mark=false;
				}
				break;
			}
			default:{
				if(!mark) {
					System.out.print((char)n);
				}
			}
			}
		}
		
	}

}
