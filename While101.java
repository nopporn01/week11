package iteration.com;

import java.util.Scanner;

public class While101 {
       public static void main(String[]args) {
    	   Scanner read = new Scanner(System.in);
    	   System.out.print("Enter any value: ");
    	   int m = read.nextInt();
    	   int i = 1;
    	   while(i<=12) {
    		   System.out.println(m +" x "  +  i  + "  = " + i*m );
    		   i =i+1;
    	   }
       }
}
