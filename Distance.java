/*Write a java program to find the distance between two points. Include zero argument constructor,
parameterised constructor, copy constructor to initialise different objects. */

import java.util.*;
class Coordinates
{
	int x,y;
	Coordinates()
	{
		x=0;
		y=0;
	}
	Coordinates(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	Coordinates(Coordinates ob)
	{
		x=ob.x;
		y=ob.y;
	}
	double Distance(Coordinates p)
	{
		return (Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)));
	}
}
class Main
{
	public static void main(String args[])
    {

	System.out.println("Enter the coordinates of point 1");
	Scanner se=new Scanner(System.in);
	int x1=se.nextInt();
	int y1=se.nextInt();
	System.out.println("Enter the coordinates of point 2");
	int x2=se.nextInt();
	int y2=se.nextInt();
	Coordinates c1=new Coordinates(x1,y1);
	Coordinates c1a=new Coordinates(c1);
	Coordinates c2=new Coordinates(x2,y2);
	double distance=c1.Distance(c2);
	System.out.println("Distance between p1 and p2 is :  " +distance);
    }
}
