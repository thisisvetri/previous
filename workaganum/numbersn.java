package workaganum;
import java.util.Scanner;

public class numbersn {

	public static void main(String args[]) {
		
		int x,y;
		System.out.println("Enter the string");
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		System.out.println("Enter number");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		
		x = s1.length();
		y = x-b;
		for(int i=0;i<x;i++)
		{
			System.out.print(s1.charAt(i));
		}
		for(int i=y;i<x;i++)
		{
			int j=y;
			while(j<x)
			{
				System.out.print(s1.charAt(j));
				j++;
			}
		}
				
	}
}
