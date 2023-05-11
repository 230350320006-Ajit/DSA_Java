import java.util.*;
import java.io.*;
class DSArray
{
	public static void main(String [] args) throws IOException
	{
		int arr[]=new int[10];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter 10 numbers");
// elements insert in array
		for(int i=0;i<arr.length;i++)       
		{
			arr[i]=Integer.parseInt(br.readLine().trim());
		}
		System.out.println("array elements are");
// elements visits from array
		for(int i=0;i<arr.length;i++)
			System.out.println("arr["+i+"]="+arr[i]);
		
		System.out.println("enter value and index position for replace");
		int val=Integer.parseInt(br.readLine().trim());
		int ind=Integer.parseInt(br.readLine().trim());
//insert at middle
		if(ind>=0 || ind<arr.length)
			for(int i=arr.length-2;i>=ind;i--)
				{arr[i+1]=arr[i];}
				arr[ind]=val;
		for(int i=0;i<arr.length;i++)
			System.out.println("arr["+i+"]="+arr[i]);

//delete from middle
		System.out.println("enter index position for delete");
		int del=Integer.parseInt(br.readLine().trim());
		if(del>=0 || del<arr.length)
			for(int i=del;i<arr.length-1;i++)
				{arr[i]=arr[i+1];}
				arr[arr.length-1]=00;
		for(int i=0;i<arr.length;i++)
			System.out.println("arr["+i+"]="+arr[i]);		

	}
}