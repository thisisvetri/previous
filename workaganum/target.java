package workaganum;
import java.util.Scanner;
public class target {



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
            int num;
            System.out.println("enter the target");
            Scanner t = new Scanner(System.in);
            int b = t.nextInt();
            do {
                System.out.println("Enter a number(between 1 and 50):");
            Scanner ip=new Scanner(System.in);
            num=ip.nextInt();
            if(num>=1&&num<=50) 
            {
                if(num>b)
                {
                    System.out.println("your number is greater than target");
                }
                else if(num<b)
                {
                    System.out.println("your number is less than target");

                }
                else {
                    System.out.println("your target is matched");
                }
            }
            else {
               System.out.println("Please enter number between 1 and 50");

            }
            }while(num!=b);
            }
    }
