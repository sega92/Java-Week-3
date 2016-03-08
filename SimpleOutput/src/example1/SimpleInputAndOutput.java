package example1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class SimpleInputAndOutput {
	public static void main(String[] args){
		
		/*
		 
		//user scanner
		Scanner input = new Scanner(System.in); //input stream puts inside Scanner variable named input
		System.out.println("Enter a String: ");
		
		String str =input.nextLine();
		System.out.println("User input: " + str);
		
		**/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = ""; //Instantiating a String variable
		
		try{
			 str = reader.readLine();	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//Export to file
		String filename = "example.txt";
		
		try{
	
			FileWriter fileWriter = new FileWriter(filename);
			
			BufferedWriter bf = new BufferedWriter(fileWriter);//Class that writes to the file
			bf.write(str);
			
			bf.close(); //Always use it
		
		
		} catch (IOException ex){
			 
			System.out.println("Error writing to a file: " + filename);
		}
	}
}
