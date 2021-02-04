package iteration.com;

import java.util.Scanner;

public class Dowhile101 {
	 public static void main(String[]args) {
		 Scanner read = new Scanner(System.in);
  	     System.out.print("Enter any value: ");
		 int m = read.nextInt();
		 int i =1;
		 do {
			 System.out.println("2 x " + i + " = "+ i*3);
			 i = i+1;
		 }while(i<12);
		 
	 }
}
