package test;

import java.util.Scanner;

public class EvenOddNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Please enter a number ");
			input = scan.nextInt();
		}
		
		
		if (input > 1) 
			{
				if (input % 2 == 0)
				{
				System.out.println("Number " + input + " is even.");
				}
				else
				{
					System.out.println("Number " + input + " is odd.");
				}
			}
		else
		{
			System.out.println("Number is not valid");
		}
		
	}
}
