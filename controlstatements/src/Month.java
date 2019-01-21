/*Q2	Write a Java program that takes a number from the user between 1 and 12 and displays the name of the corresponding month until the user wants to exit the program. */
import java.util.*;
class Month{
	
	public static void main(String arg[]){
	Scanner a=new Scanner(System.in);
	int num;
	int c=1;
	while(c==1){
	System.out.println("enter a number between 1-12 :");
	num=a.nextInt();
	switch(num){
	case 1 :
	System.out.println("jan");
	break;
	case 2 :
	System.out.println("feb");
	break;
	case 3 :
	System.out.println("mar");
	break;
	case 4 :
	System.out.println("apr");
	break;
	case 5 :
	System.out.println("may");
	break;
	case 6 :
	System.out.println("june");
	break;
	case 7 :
	System.out.println("july");
	break;
	case 8 :
	System.out.println("aug");
	break;
	case 9 :
	System.out.println("sep");
	break;
	case 10 :
	System.out.println("oct");
	break;
	case 11:
	System.out.println("nov");
 break;
 case 12 :
	System.out.println("dec");
	break;
	default:
	System.out.println("enter a valid number between 1- 12");
	}
 c=0;
 System.out.println("press 1 if u want to continue");
 c=a.nextInt();
	}
	}
}