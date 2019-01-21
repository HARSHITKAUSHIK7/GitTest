 /*1.	Write a program that takes two integers (values to be given within the program) and displays the output of the following operators: addition, subtraction, multiplication, division and modulus. */
 public class Calculator {
	public static void main(String[] args){
		int a ;
		int b ;
		int sum;
		int sub;
		int mult;
		float div;
		float mod; 
		a = 27 ;
		b = 13 ;
		sum = a+b ;
		sub = a-b ;
		mult = a*b ;
		div = a/b ;
		mod = a-(div*b) ;
		System.out.println("The numbers are: "+ a +"&"+ b) ;
		System.out.println("Sum = "+ sum);
		System.out.println("Substraction = "+ sub);
		System.out.println("Multiply = "+ mult);
		System.out.println("Division = "+ div);
		System.out.println("Modulus = "+ mod);

	}
}