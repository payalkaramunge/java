import java.util.Scanner;

public class Assignment1 {
    public static void main (String[] args) throws java.lang.Exception
	{
        System.out.println("Enter your value: ");
		Scanner scanner = new Scanner(System.in);
                int fahrenheit = scanner.nextInt();
                int celsius = (((fahrenheit-32)*5)/9);
                System.out.println(celsius);
	}
}
