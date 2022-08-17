package runall;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client1 {
	Socket s;BufferedReader in,keyin;PrintStream out;
	public Client1() {
		try {
			while(true) {
			s=new Socket("localhost",2000);
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println("Message From Server..:"+in.readLine());
			
			keyin=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please Enter Message for server..:");
			String msgToServer=keyin.readLine();
			
			out=new PrintStream(s.getOutputStream());
			out.println(msgToServer);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Client1();
	}
}

