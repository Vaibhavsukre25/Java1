package runall;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	
	/*
	 * import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.PrintStream;
	import java.net.ServerSocket;
	import java.net.Socket;
	 */
	
		ServerSocket ss;Socket s;PrintStream out;BufferedReader keyin,in;
		public Server1() {
			try {
				ss=new ServerSocket(2000);
				System.out.println("Server Ready...");
				while(true) {
				s=ss.accept();
				out=new PrintStream(s.getOutputStream());
				keyin=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Please enter a message for client..:");
				String msgToClient=keyin.readLine();
				out.println(msgToClient);
				
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				String msgFromClient=in.readLine();
				System.out.println("Message From Client..:"+msgFromClient);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		public static void main(String[] args) {
			new Server1();
		}

}
