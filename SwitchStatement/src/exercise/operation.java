package exercise;

import java.util.Scanner;

public class operation {
	
		public static void main(String[] args){
			Scanner input1 = new Scanner(System.in); //input stream puts inside Scanner variable named input
			Scanner input2 = new Scanner(System.in);
			Scanner operator = new Scanner(System.in);
			
			System.out.print("Enter the first number : ");
			String str1 = input1.nextLine();
			
			System.out.print("Enter the second number : ");
			String str2 = input2.nextLine();
			
			System.out.print("What would you like to perform ");
			String str3 = operator.nextLine();
			
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			
			switch (str3){
			case "+":
				System.out.println("Answer = " + (num1+num2));
			case "-":
				System.out.println("Answer = " + (num1-num2));
			case "*":
				System.out.println("Answer = " + (num1*num2));
			case "/":
				System.out.println("Answer = " + (num1/num2));	
			default:
				break;
			}
		}
}
