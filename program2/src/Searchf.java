import java.util.*;
class Searchf{
	public static void main(String[] args){
	Scanner sc = new Scanner (System.in);
	int[] a= new int[10];
	int item;
	System.out.print("enter the element of the array");
	for (int i=0;i<10;i++){
	a[i]=sc.nextInt();
	}
	System.out.print("enter the item to search");
	item =sc.nextInt();
	int loc =search(a, item);
	if(loc==-1)
	System.out.print("item not in the list");
	else
	System.out.print("ite at location"+loc);


	}

	static int search(int []s,int item ){
	int i;
	for (i=0;i<10;i++){
	if(item==s[i])
	return i;

	}
	return -1;
	}
	}
