/*3.	Write a Java program that reads in two floating-point numbers and tests   whether they are the same up to three decimal places.*/
import java.util.*;

class Decimal{
	 public static void main(String args[]) {
	Scanner input=new Scanner (System.in); 
		System.out.print("Input first floating-point number: ");
        double x = input.nextDouble();
        System.out.print("Input second floating-point  number: ");
        double y = input.nextDouble();

        x = Math.round(x * 1000);
        

        y = Math.round(y * 1000);
        

        if (x == y)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }  
}