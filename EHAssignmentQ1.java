package Assignment.com;

import java.util.Scanner;

public class EHAssignmentQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("enter value of X : ");
        int x = sc.nextInt();

        System.out.println("enter value of Y : ");
        int y = sc.nextInt();
        int z;
        try {
            z = x / y;
            System.out.println("Value of Z is :" + z);
        } catch (ArithmeticException e) {
            System.out.println("Avoid dividing by integer 0 " + e);
        }
        if (y == 0) {
            System.out.println("EXCEPTION IS HANDLED");
        }
   

	}

}
