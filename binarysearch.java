package searching;
import java.util.Arrays;
import java.util.Scanner;
public class Binary {
	public static int bsearch(int A[],int start,int end,int key)
	{
		if(end>=1) 
		{
			int mid=(start+end)/2;
		 if(A[mid]==key)
		 
			 return mid;
		
		 if(A[mid]>key)
		 
			return bsearch(A,0,mid-1,key);
		 
			return bsearch(A,mid+1,end,key);	
		}
		
			return -1;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		// Arrays.sort(arr);
		System.out.println("Enter the element to search");
		int search=sc.nextInt();
		int found=bsearch(arr,0,n,search);
		if(found==-1)
		{
			System.out.println("Number not found");
		}
		else
		{
			System.out.println(search+" Found at index "+found);
		}
		sc.close();
	}

}
