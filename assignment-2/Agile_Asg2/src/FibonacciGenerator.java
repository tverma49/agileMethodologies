import java.util.Scanner;

public class FibonacciGenerator {

	static String[] s = null;
	public static void validateN(int n)
	{
		if(n<1)
		{
			System.out.println("Please enter a positive integer.!\n");
			main(s);
		}
		else
		{
			System.out.print(n+"th value in fibonacci sequence is : "+calculateNthValue(n));
		}
	}
	
	public static int calculateNthValue(int n)
	{
		while(n>2)
		{
			return calculateNthValue(n-1) + calculateNthValue(n-2);
		}
		return 1;
	}
	public static void main(String[] args) {
		int n=0;
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a no. : ");
			n = sc.nextInt();
			validateN(n);
		}
		catch(Exception e)
		{
			System.out.println("Try to enter a positive integer.!\n");			
			main(s);
		}
	}
}
