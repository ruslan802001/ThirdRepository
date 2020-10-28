package Work3;

import java.util.Scanner;

public class Grape {
	
	public static void main(String[]args) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter your first number");
		
		int x = number.nextInt();
		
		System.out.println("Enter your second number");
		
		int z = number.nextInt();
		
		if (x>z) {
			System.out.println("positive");
		} else {
			System.out.println("negative");
		}
		}
		

	}


