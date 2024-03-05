
import java.util.Scanner;

public class Assignment3
{
	public static void main (String[] args) throws java.lang.Exception
	{
                System.out.println("Enter your value: ");
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