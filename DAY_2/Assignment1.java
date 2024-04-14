// Given a temperature, of F in Fahrenheit, your task is to convert it into Celsius using the following equation:-
// T(°C) = (T(°F) - 32)*5/9
// Note: It is guaranteed that F - 32 will be a multiple of 9.

import java.util.Scanner;

public class Assignment1 {
    
    public static void main (String[] args) throws java.lang.Exception
	{
        System.out.println("Enter your value fahrenheit: ");
        
		Scanner scanner = new Scanner(System.in);
                int fahrenheit = scanner.nextInt();
                int celsius = (((fahrenheit-32)*5)/9);
                System.out.println(celsius);
	}
}
