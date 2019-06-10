
import java.util.Scanner;
import java.math.*;
import java.util.Random;
public class Driver {
	static String generate(int pwLength) { 
		//Method to generate random character for password
		//@param pwLength length of desired password
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWSYZ"+
						"0123456789"+
						"abcdefghijklmnopqrstuvwxyz"+
						"!@#$%^&*";
		StringBuilder s = new StringBuilder(pwLength);
		for (int i = 0; i <= pwLength; i++ ) {
			int index = (int) (chars.length() * Math.random());
			s.append(chars.charAt(index));
			
		}
		return s.toString();
		
	}
	public static void main(String[] args) {
		
		//Main method 
		//This program is made to generate a line of random password
		//The purpose of generating random password is for enhancing security in account management'
	//ASk user for length og password
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter desired length of password: >>");
		int length = scan.nextInt();
		
		System.out.println("Generating password with length " + length+ "...." );
		
		
		//plug length into 'generate' method
		String result = generate(length);
		
		System.out.println("Requested randomized password is: " + result);
		
	}
	
}
