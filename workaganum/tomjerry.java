package workaganum;
import java.util.Scanner;

public class tomjerry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number between 20 nd 30");
		Scanner number= new Scanner(System.in);
		int num = number.nextInt();
		
		if((num>=20)&&(num<=30)) {
			
		if(num%2==0)
		{
			System.out.println("Jerry");
		}
		else {
			System.out.println("Tom");
		}
		
		}else {
			System.out.println("entered a wrong value");
	}

}
}
