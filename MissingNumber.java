/*How to find the missing number in the given integer array of 1 to 100 without using any inbuilt function*/

import java.util.Scanner;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int[] input ={1,2,3,4,5,6,8,10,11,13,14,
				15,16,17,18,19,20,21,22,24,25,
				26,27,28,29,30,31,32,33,34,35,
				37,38,39,40,41,42,43,44,45,46,47,
				48,49,50,51,52,53,54,55,56,57,58,
				59,60,61,62,63,64,65,66,67,68,69,
				70,71,72,73,74,75,76,77,78,79,80,
				81,82,83,84,85,86,87,88,89,90,91,
				92,93,94,95,96,97,98,99,100};
		
		Scanner s = new Scanner(System.in);
		int present = input.length;
		
		System.out.println("Enter initial length of Array:");
		int max =s.nextInt();
		
		int numMiss = (max - present)+1;
		
		
		
		int[] register = new int[input.length+numMiss];
		for(int i:input)
		{
			register[i] = 1;
		}
		System.out.println("Missing numbers in array:");
		try{
		for( int i = 1;i <= register.length; i++)
		{
			if(register[i]==0)
			{
				System.out.print(i+",");
			}
		}
		}
		catch(ArrayIndexOutOfBoundsException e){
			
		}
		
	}
	
	
	}
