import java.util.*;

class DecimalCompare{
	 public static void main(String args[]) {
	 	Scanner a =new Scanner(System.in);
	 	System.out.println("enter two no");
	 	float num1=a.nextInt();
	 	float num2=a.nextInt();
	 	int a,b;
	 	a=num1;
	 	b=num2;
	 	num1=num1-a;
	 	num2=num2-b;
	 	num1=num1*1000;
	 	num2=num2*1000;
	 	if(a==b){
	 		System.out.println("thay are equal");

	 	}
	 	else{
	 		System.out.println("they are not equal");
	 	}
		
	}
}