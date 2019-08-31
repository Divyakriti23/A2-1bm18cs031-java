/*Create a 2D array which stores the marks of all students for different subjects. 
Number of student and number of subjects should be user input. 
Now, find the average and total marks for each student. Also calculate the average 
and total marks for each subject.
All total and average marks should be stored in the 2D array in corresponding rows and columns */

import java.util.*;
class Student
{
	float m[][];
	int ns,nm;
	void input()
	{
		System.out.println("Enter total no. of students and subjects");
		Scanner sc=new Scanner(System.in);
		ns=sc.nextInt();
		nm=sc.nextInt();
		m=new float[ns+2][nm+2];
		
		for(int i=0;i<ns;i++)
		{
		    System.out.println("Enter marks of student "+ (i+1));
			for(int j=0;j<nm;j++)
			{
				m[i][j]=sc.nextFloat();
			}
		}
	}
	void cal()
	{
		float sum=0;
		float avg=0;
		for(int i=0;i<ns;i++)
		{
			for(int j=0;j<nm;j++)
			{
				
				sum=sum+m[i][j];
			}
				m[i][nm]=sum;
				avg=(float)sum/(float)nm;
				m[i][nm+1]=avg;
				sum=0;
			
		}
		for(int j=0;j<nm;j++)
		{
			for(int i=0;i<ns;i++)
			{
				
				sum=sum+m[i][j];
			}
				m[ns][j]=sum;
				avg=(float)sum/ns;
				m[ns+1][j]=avg;
				sum=0;
			
		}
	}
	void output()
	{
		System.out.println("the last two rows and columns contains sum and average respectively of that row or column");
		for(int i=0;i<ns+2;i++)
		{
			for(int j=0;j<nm+2;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}
}
class Main
{
	public static void main(String args[])
{
	Student s1=new Student();
	s1.input();
	s1.cal();
	s1.output();
}
}
