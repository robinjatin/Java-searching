package searching;
import java.util.Scanner;
public class Linear {
	public static int search(int[] A,int key)
	{
		int n=A.length;
		for(int i=0;i<n;i++)
		{
			if(A[i]==key)
			{
				return i;
			}
		}
		return -1;
	}

	    public static void main(String[] args) 
	    { 
	        int n;
	        System.out.println("Enter the size of the array");
	        Scanner sc=new Scanner(System.in);
	        n=sc.nextInt();
	        int A[]=new int[n];
	        System.out.println("Enter the elements of the array");
	        for(int i=0;i<n;i++)
	        {
	        	A[i]=sc.nextInt()
	        			;
	        }
	        System.out.println("Enter the element you want to search");
	        int key=sc.nextInt();
	        int index= search(A,key);
	        if(index>=0)
	        {
	        	System.out.println("Element "+key+" found at the index "+index);
	        }
	        else
	        {
	        	System.out.println("Element "+key+" does not exist");
	        }
	        sc.close();
	        } 
	} 


