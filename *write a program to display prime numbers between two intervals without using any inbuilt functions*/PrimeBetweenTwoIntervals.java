/*write a program to display prime numbers between two intervals without using any inbuilt functions*/

import java.util.Scanner;

public class PrimeBetweenTwoIntervals {
	
	public static void main(String[] args) {
		int low,high;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the lower limit:");
		low = s.nextInt();
		System.out.println("Enter the higher limit:");
		high = s.nextInt();
		System.out.println("Prime Numbers between the interval "+low+" and "+high+":");
		
		if(low>=high)
		{
			System.out.println("Invalid Entries");
			
		}
		
		while(low < high){
			boolean flag = false;
			for(int i =2 ; i<= low/2; ++i){
				
				if(low%i ==0){
					flag=true;
					break;
				}
			}
			if(!flag)
			
				
				System.out.println(low+" ");
				++low;
			
		}
		
	}

}

