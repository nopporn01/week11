package iteration.com;

import java.util.Scanner;

public class For101 {
	public static void main(String[]age) {		
		 Scanner read = new Scanner(System.in);
		 System.out.print("Enter any value: ");
		 int count = read.nextInt();
      for(int i=1;i<=12;i=i+1) {
    	  System.out.println(count + " x " + i + "  =" + i *count);
          }
      }
}
