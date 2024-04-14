// In this challenge, you will learn to read input for the first time. The most popular way to read input in java is by using Scanner.

import java.util.Scanner;

public class Assignment2 {
  
public static void main (String[] args) throws java.lang.Exception
	{
    System.out.println("Enter your value of a,b,c: ");
    
		Scanner scanner = new Scanner(System.in);
    
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
	}
}