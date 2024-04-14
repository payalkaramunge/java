
// You are given two positive integers. You have to calculate the result by performing +,-,*,/,% operations on them.


import java.util.Scanner;

public class Assignment3
{
	public static void main (String[] args) throws java.lang.Exception
	{
                System.out.println("Enter your value of A,B: ");        
                      
		Scanner scanner = new Scanner(System.in);
                
                int A = scanner.nextInt();
                int B = scanner.nextInt();
                
                System.out.println(A+B);

                System.out.println(A-B);

                System.out.println(A*B);

                System.out.println(A/B);
                
                System.out.println(A%B);
	}
}