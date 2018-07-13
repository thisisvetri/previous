package workaganum;


	import java.util.Scanner;
	public class reverse {

	    
	        public static void main(String[] args) {
	             System.out.println("enter a string");
	            Scanner s = new Scanner(System.in);
	            String s1 = s.next();
	            String s2 ="";
	            
	        
	            for (int i=s1.length()-1; i>=0; i--) {
	              s2 += s1.charAt(i);
	            }
	        
	            System.out.println(s2);
	        }
	}
	          
	        
