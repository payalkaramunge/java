// Circle Area-Perimeter
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
