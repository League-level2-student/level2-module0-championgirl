package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] arr = {"String1", "String2", "String3", "String4", "String5"};
		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2] = "different string";
		//4. print the third element again
		System.out.println(arr[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//6. make an array of 50 integers
		int []arr2 = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < arr2.length; i++) {
			
			arr2[i] = new Random().nextInt(100);			
			System.out.println(arr2[i]);
		}
		
		
		
		//8. without printing the entire array, print only the smallest number in the array
		
	//	int smallest = arr2[0];
		
		//for(int i = 0; i < arr2.length; i++) {
		//	if (arr2[i] < smallest) {
		//		smallest = arr2[i];
		//	}
		//}
		//System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	int greatest = arr2[0];
		
		for(int i = 0; i < arr2.length; i++) {
			if (arr2[i] > greatest) {
				greatest = arr2[i];
			}
		}
		System.out.println(greatest);
		
		
	}
}
