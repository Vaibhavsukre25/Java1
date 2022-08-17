/**
 * 
 */
package ch6;

/**
 * @author admin
 *
 */
public abstract class Demo {

	/**
	 * 
	 */
	public Demo() {
		System.out.println("Called....");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Demo don = new Demo() {
			
		};
	}

}
