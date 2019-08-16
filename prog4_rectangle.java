/*Create a class Rectangle with member variables: length and width. Define member functions to take input, compute area and print area along with values of length and width. Create two objects for class Rectangle and invoke the functions.*/

import java.util.*;
class Rectangle
{
	int length, width;
	void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		length = sc.nextInt();
		System.out.println("Enter the width of rectangle");
		width= sc.nextInt();
	}
	int area()
	{
		int area=length*width;
		return area;
	}
	void print()
	{
		System.out.println("Length of rectangle = "+length);
		System.out.println("Width of rectangle = "+width);
		int area=area();
		System.out.println("Area of rectangle = "+area);
	}
	public static void main(String args[])
	{
		Rectangle r1= new Rectangle();
		Rectangle r2= new Rectangle();
		System.out.println("Rectangle 1");
		r1.input();
		r1.area();
		r1.print();

		System.out.println("Rectangle 2");
		r2.input();
		r2.area();
		r2.print();
	}
}
		
		



