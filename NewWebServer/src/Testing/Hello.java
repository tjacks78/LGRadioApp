/**
 * Imports		
 */

package Testing;

import java.io.*;
//import java.lang.*;

/**
 * @author tjacks5
 *
 */
public class Hello {

	/**
	 * 
	 */
	public Hello() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String t = "tEra areT";
		String J = null;
		System.out.println("Yo What up? ");
		
		DetectPalindrome det = new DetectPalindrome();
		
		boolean bool = det.detect(t);
		
		boolean bool2 = det.detectNoCase(t);
		System.out.println("First Detect: " + bool + " No Case: " + bool2);

	}

}
