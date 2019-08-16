/*Write a java program to find maximum element in 2D array(Use for each loop).*/

import java.util.*;
class Max
{
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of the rows");
		int r = sc.nextInt();
		System.out.println("Enter the number of the columns");
		int c = sc.nextInt();
		int arr[][]= new int[r][c];
		int i, j;

		//Input

		System.out.println("Enter the array elements of Matrix \n");
		for(i=0;i<r;i++)
		{
			System.out.println("Enter row " + (i+1));
			for(j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

		//Find Max element
		int max=0;
		System.out.println("The maximum element is \n");
		for(i=0;i<r;i++)
		{
	
			for(j=0;j<c;j++)
			{
				if(max<arr[i][j])
				{
					max=arr[i][j];
				}	
			}
		}
		System.out.println(max);

	}
}


		


		
