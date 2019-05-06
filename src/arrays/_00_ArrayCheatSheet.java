package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] Sarray = {"joe", "bow", "moe", "kachow", "lowe"};
		//2. print the third element in the array
		System.out.println(Sarray[3]);
		//3. set the third element to a different value
		Sarray[3]= "new";
		//4. print the third element again
		System.out.println(Sarray[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0; i<Sarray.length; i++){
			System.out.println(Sarray[i]);
		}
		
		//6. make an array of 50 integers
		int[] Irray = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		int intran = rand.nextInt(250);
		for(int i=0; i<Irray.length;i++){
			System.out.println(Irray[i]);
			Irray[i]=intran;
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
