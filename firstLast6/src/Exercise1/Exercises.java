package Exercise1;

public class Exercises {
	public static void main(String[] args){
	
		int[] myArray = {5,2,3,1,3};
		int[] myArray2 = {3, 2,3,5};
		
		/*boolean isPresent = firstLast6(myArray);
		System.out.println("Exercise 1 : " + isPresent);
		
		boolean isSame = sameFirstLast(myArray);
		System.out.println("Exercise 2 : " + isSame);
		
		boolean areSame = commandEnd(myArray, myArray2);
		System.out.println("Exercise 3 : " + areSame);
		
		int[] newArray = maxEnd3(myArray);
		System.out.println("Exercise 4 : " + newArray);
		
		boolean is23 = has23(myArray);
		System.out.println("Exercise 5 : " + is23);*/
		
		int numberOfEvens = sameFirstLast1(myArray);
		System.out.println("Exercise 6 : Number of evens: " + numberOfEvens);
		
	}
	
	
	public static boolean firstLast6(int[] myArray)
	{
		  return (myArray[0] == 6) || (myArray[myArray.length - 1] == 6);
	}
	
	
	public static boolean sameFirstLast(int[] myArray) 
	{
		  return (myArray.length >= 1) && (myArray[0] == myArray[myArray.length-1]);
	}
	
	
	public static boolean commandEnd(int[] myArray , int[] myArray2) 
	{
		 return (myArray[0] == myArray2[0]) || (myArray[myArray.length-1] == myArray2[myArray2.length-1]);
	}
	
	
	public static int[] maxEnd3(int[] myArray){
		int max = 0;
		if(myArray[0]>myArray[myArray.length - 1]){
			 max = myArray[0];
		}
		else
		{
			max = myArray[myArray.length - 1];
		}
			for(int i=0; i < myArray.length; i++){
				myArray[i] = max;
			}
		return myArray;
	}
	
	public static boolean has23(int[] myArray)
	{
		  return ((myArray[0] == 2) || (myArray[myArray.length - 1])==2 || (myArray[0] == 3) || (myArray[myArray.length - 1] == 3));
	}
	
	public static int sameFirstLast1(int[] myArray)
	{
		int n = 0;
		for(int i=0; i < myArray.length; i++){
		
			if ((myArray[i] % 2) == 0){
				
				n = n+1;
			};
		}
		return n;
	}
	 	
	
	
}
