/*2. Design an interface named Stack with the following methods:
a) push and pop elements from the stack
b) check whether the stack is empty or not.
Implement the stack with the help of arrays and if the size of the array becomes too small to hold the elements, create a new one. Test this interface by inheriting it in its subclass StackTest.java*/

import java.util.*;
interface Stack{
	int stackEmpty();
	void push(int item);
	int pop();
	void display();
}

class StackTest implements Stack{
	int tos, size;
	int stk[];
	StackTest(){
		tos = -1;
		size = 5;
		stk = new int[size];
	}
	public int stackEmpty(){
		if(tos == -1)
			return 0;
		else 
			return 1;
	}
	public void push(int item){
		if(tos == size-1){
			size = size*2;
			int temp[] = new int[size];
			
			for(int i=0;i<size/2;i++){
				temp[i] = stk[i];
			}
			stk = temp;
		}
		
		tos=tos+1;
		System.out.println(tos);
		stk[tos] = item;
	}
	public int pop(){
		if(stackEmpty()==0){
			System.out.println("Stack empty");
			return 0;
		}
		else{
			return stk[tos--];
		}
	}
	public void display(){
		if(stackEmpty()==0){
			System.out.println("Stack empty");
			return;
		}
		System.out.println("Elements are\n");
		for(int i=0;i<=tos;i++){
			System.out.println(stk[i]);
		}
	}
}

class Demo{
	public static void main(String args[]){
		int ch, item, ch1;
		StackTest ref = new StackTest();
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("PRESS 1: push\nPRESS 2: pop\nPRESS 3: display\n");
			ch1= sc.nextInt();
			
			switch(ch1){
				case 1: System.out.println("Enter the number you want to enter");
					item = sc.nextInt();
					ref.push(item);
					break;
				case 2: ref.pop();
					break;
				case 3: ref.display();
					break;
			}
			System.out.println("PRESS 1:continue\nPRESS 0:stop");
			ch = sc.nextInt();
		}while(ch!=0);
		
	}
}

/*output

/*2. Design an interface named Stack with the following methods:
a) push and pop elements from the stack
b) check whether the stack is empty or not.
Implement the stack with the help of arrays and if the size of the array becomes too small to hold the elements, create a new one. Test this interface by inheriting it in its subclass StackTest.java*/

import java.util.*;
interface Stack{
	int stackEmpty();
	void push(int item);
	int pop();
	void display();
}

class StackTest implements Stack{
	int tos, size;
	int stk[];
	StackTest(){
		tos = -1;
		size = 5;
		stk = new int[size];
	}
	public int stackEmpty(){
		if(tos == -1)
			return 0;
		else 
			return 1;
	}
	public void push(int item){
		if(tos == size-1){
			size = size*2;
			int temp[] = new int[size];
			
			for(int i=0;i<size/2;i++){
				temp[i] = stk[i];
			}
			stk = temp;
		}
		
		tos=tos+1;
		System.out.println(tos);
		stk[tos] = item;
	}
	public int pop(){
		if(stackEmpty()==0){
			System.out.println("Stack empty");
			return 0;
		}
		else{
			return stk[tos--];
		}
	}
	public void display(){
		if(stackEmpty()==0){
			System.out.println("Stack empty");
			return;
		}
		System.out.println("Elements are\n");
		for(int i=0;i<=tos;i++){
			System.out.println(stk[i]);
		}
	}
}

class Demo{
	public static void main(String args[]){
		int ch, item, ch1;
		StackTest ref = new StackTest();
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("PRESS 1: push\nPRESS 2: pop\nPRESS 3: display\n");
			ch1= sc.nextInt();
			
			switch(ch1){
				case 1: System.out.println("Enter the number you want to enter");
					item = sc.nextInt();
					ref.push(item);
					break;
				case 2: ref.pop();
					break;
				case 3: ref.display();
					break;
			}
			System.out.println("PRESS 1:continue\nPRESS 0:stop");
			ch = sc.nextInt();
		}while(ch!=0);
		
	}
}


	
			
		
	*/
	
			
		
	
