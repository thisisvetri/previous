package workaganum;
import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string,str;
		System.out.println("enter a string");
         Scanner ip = new Scanner(System.in);
         string = ip.next();
        
         str= string.toLowerCase();
         try
         {
        	 Integer.parseInt(str);
        	 System.out.println("The input is not a letter");
         }
         catch (NumberFormatException e) {
        	 for (int i=0; i<str.length(); ++i)
        	 {
        		 char ch = str.charAt(i);
        		 if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
        			 System.out.println(ch+ " is vowel");
        			 
        		 }
        		 else if(ch>='b' && ch<='z')
        		 {
        			 System.out.println(ch+" is consonant");
        		 }
        	 }
         }
	}
}

        