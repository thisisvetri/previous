package workaganum;
import java.util.Scanner;
public class loop {

	public static void main(String args[]) {
		
		System.out.println("enter a no:");
		Scanner a= new Scanner(System.in);
		int n=a.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);;
			}
		}
	}
}
