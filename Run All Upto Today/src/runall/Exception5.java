package runall;

public class Exception5 {
     public static void main(String[] args) {
		
    	 ATM bobAtm=new ATM();
 		try {
 			int amt=bobAtm.withDrawMoney(1000);
 			System.out.println(amt);
 			amt=bobAtm.withDrawMoney(1000);
 			System.out.println(amt);
 			
 			amt=bobAtm.withDrawMoney(9000);
 			System.out.println(amt);
 		}catch(NoCashException ne) {
 			System.out.println(ne);
 		}
 	}
 }
 class NoCashException extends Exception{
 	String msg;
 	public NoCashException(String msg) {
 		// TODO Auto-generated constructor stub
 		this.msg=msg;
 	}
 	@Override
 	public String toString() {
 		return "Exception is...:"+msg;
 	}
 }
 class ATM{
 	int atmBalance=10000;
 	public int withDrawMoney(int amt) throws NoCashException{
 		if(amt>atmBalance) {
 			throw new NoCashException("ATM cash balance is lower than your amount, please enter a lesser amt");
 		}
 		else {
 			atmBalance=atmBalance-amt;
 			return amt;
 		}
	}
}
