package workaganum;
import java.util.Scanner;
public class elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           char x;
           System.out.println("enter a character");
           Scanner i = new Scanner(System.in);
           x = i.next().charAt(0);
           if(x >= 'A' && x <= 'Z')
           {
        	System.out.println(x+" the letter is Capital letter");   
           }
           else  if(x >= 'a' && x <= 'z')
           {
        	System.out.println(x+" the letter is small letter");   
           }
           else if(Character.isDigit(x))
           {
        	System.out.println(x+" is a digit");   
           }
           else {
        	   System.out.println(x+" is a symbol");
           }
	}

}
