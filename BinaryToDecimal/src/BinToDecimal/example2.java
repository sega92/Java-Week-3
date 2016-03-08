package BinToDecimal;


import java.util.Scanner;

public class example2 {
public static void main(String[] args){
		//user scanner
		Scanner input = new Scanner(System.in); //input stream puts inside Scanner variable named input
		System.out.println("Enter a binary number. Only [1]s and [0]s: ");
		
		String str =input.nextLine();

		System.out.println("User input: " + str);
	
		int dec = 0;
		int length =  str.length();
		
		System.out.println("The number of digits is: " + length); 
		
		for (int i = 0; i < str.length(); i++){
			
			char index = str.charAt(i);
				
			System.out.println(index); 
			
			if((char)index == '1'){
				
				dec = (int) (dec + Math.pow(2,length-1));
				System.out.println("dec " + dec); 
			}; 
			length --;	
		}
		System.out.println("The decimal number is: " + dec); 
		
		
		
		
		
	}
}
