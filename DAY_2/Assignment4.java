// Circle Area-Perimeter

// You are required to take the radius of a circle as input from the user, and finally, print the area and perimeter of the circle.
// Note: Take pi as 3

import java.util.*;
public class Assignment4 {    

	public static void main (String[] args) throws java.lang.Exception
	{
        System.out.println("Enter radius: ");
		Scanner scanner = new Scanner(System.in);
                double rad = scanner.nextDouble();
                double pi = 3.14;
                double area = 3.14*rad*rad;
                double peri = 2*3.14*rad;
                System.out.println(area);
                System.out.println(peri);
	}
}
