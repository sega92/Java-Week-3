package exercise;

import java.util.Scanner;

public class SimpleIceCream {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //input stream puts inside Scanner variable named input
		System.out.println("What size of ice cream cone would you like? : ");
		System.out.println("Enter [1]Small [2]Medium [3]Large [4]Huge : ");
		
		String str =input.nextLine();
		
		switch (str){
		case "1":
			System.out.println("The Cost: £1.25");
		case "2":
			System.out.println("The Cost: £2.25");
		case "3":
			System.out.println("The Cost: £3.25");
		case "4":
			System.out.println("The Cost: £4.00");
		default:
			break;
		}
		
			
		}

	
	
	

	
	}
