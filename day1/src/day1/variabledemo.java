package day1;

public class variabledemo {
	public static void m2ain(String[] args) {
		//variable declaration
		int i;//i of type int, i is the name of the variable and its data type is number (int)
		//variable initialization
		
				i=10;//number 10 is ASSIGNED to a variable i of type int
				
				//valid names
				int age;//valid name
				int $age;//valid name
				int _age;//valid name
				int a$_ge;//valid name
				int a$g_2_e;//valid name
				//Any name starting with a character or $ or _ is a valid name
				//$, _ can also be inbetween along with numbers.
				
				//invalid names
				//int 2num; - invalid name - variable names cannot start from number
				//int #num;- invalid name - variable names cannot start with any other special character other than $ and _
				//int nu m;//invalid name - variable name cannot have space in between
				//int void;//invalid name - keywords cannot be variable name
				
				//The same concept of valid identifier is applied to method names and class names.
				
				//let us list all the variables
				//Number types family
				//from jdk7 underscores can be used in between number values for easy readability, but when they are used for calculations and printing, automatically the
				//undrscore will be ignored
				byte b=127; // 8 bit - -128 to 127
				short s=32_76_7;// 16 bit - -32768  to 32767
				int ii=10;//32 bit
				long l=10;//64 bit

				//decimal or float type family - float size is - 32 bit and double size is - 64 bit
				float f=10;
				float ff=10.5f;//for float with decimal value should compulsorily have f as suffix
				double d=1010.23;
				
				//boolean family - only true or false , you cannot use null, 0, 1, yes, no etc
				
				boolean boo=true;
				boolean boo2=false;
				//char family
				
				char c='a';// either a character or a number can be given, character should be given in single quotes - Range - 0 - 65535
				char cc=97;//97 is the ASCII code (American standard code for Information interchange)
				
				//Text family
				String str="My Name is Goldi........";//any length of text can be given...
				System.out.println("vaibhav");
				
			}
}
