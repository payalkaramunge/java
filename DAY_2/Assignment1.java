
public class Assignment1 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int fahrenheit = sc.nextInt();
                int celsius = (((fahrenheit-32)*5)/9);
                System.out.println(celsius);
	}
}
