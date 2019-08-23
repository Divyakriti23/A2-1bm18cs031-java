import java.util.*;
class Student
{
	String usn, name;
	int credits[], marks[], n;

	void Input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects");
		n=sc.nextInt();
		credits = new int[n];
		marks = new int[n];
		System.out.println("Enter your name and usn");
		name = sc.next();
		usn = sc.next();
		System.out.println("Enter the credits and the marks respectively");
		for(int i=0;i<n;i++)
		{
			System.out.println("Subject "+ (i+1)+ ":");
			credits[i]=sc.nextInt();
			marks[i]=sc.nextInt();
		}
	}
	
	void Display(float sgpa)
	{
		System.out.println("Name -> " + name);
		System.out.println("USN -> " + usn);
		System.out.println("SGPA -> " + sgpa);
	}
	float Calculate_sgpa()
	{
		int credit_sum=0;
		int grade_points[]= new int[n];
		int total=0;
		float sgpa;
		for(int i=0;i<n;i++)
		{
			credit_sum+=credits[i];
			
			if(marks[i]>=0 && marks[i]<=40)
				grade_points[i]=0;
			else if(marks[i]>40 && marks[i]<=60)
				grade_points[i]=7;
			else if(marks[i]>60 && marks[i]<=75)
				grade_points[i]=8;
			else if(marks[i]>75 && marks[i]<=90)
				grade_points[i]=9;
			else
				grade_points[i]=10;


		//Calculate total
		total= total + (grade_points[i] * credits[i]);
		}

		//Calculate sgpa
		sgpa = (float)total/credit_sum;

		return sgpa;
	}
}

class StudentDemo
{
	public static void main(String args[])
	{

		Student obj = new Student();
		obj.Input();
		float sgpa = obj.Calculate_sgpa();
		obj.Display(sgpa);
	}
}
		

OUTPUT

Enter the number of subjects
5
Enter your name and usn
Nanma
1bm18cs031
Enter the credits and the marks respectively
Subject 1:
4
88
Subject 2:
3
22
Subject 3:
5
90
Subject 4:
5
89
Subject 5:
4
99
Name -> Nanma
USN -> 1bm18cs031
SGPA -> 7.904762


		
			



		
		
	
	
