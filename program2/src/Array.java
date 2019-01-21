import java.util.*;
class Array
{
	 public static void main(String args[]) {
	 	Scanner s=new Scanner(System.in);
	 	int arr[]= new int[10];
	 		 	
	 System.out.println("enter the no");
	 int i=0;
	 for (i=0;i<10;i++)
	 {
	 arr[i]=s.nextInt();
	 }
	 System.out.println("enter the no. to be searched");
	 int num=s.nextInt();
	 int a=0;
	 for (int j=0;j<10;j++)
	 {
	 	if(arr[j]==num)
	 	{
	 		a=1;
	 		System.out.println("element found at:"+(j=1));
	 		break;

	 	}
	 }
	 if(a==0)
	 {
	 	System.out.println("element is not in the list");
	 }
}
}
