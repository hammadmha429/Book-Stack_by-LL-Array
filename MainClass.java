 package book;

import java.util.Scanner;

public class MainClass {
	public static int menu(Scanner s)
	{
		int r;
		do {
			System.out.println("1: Enter an book:"
					+ "\n2: Remove a book:"
					+ "\n3: Display all books:"
					+ "\n4: Display book at top");
			r=s.nextInt();
		}while(r!=1 && r!=2 && r!=3 && r!=4);
		return r;
	}
public static void main(String [] args)
{
	Scanner obj = new Scanner(System.in);
	int countarray = 10,count=0;
	Book[] bkary = new Book[countarray];
	stack b = new stack();
	int imp;
	do{System.out.println("1: Implement Linked list:"
			+ "\n2: Implement Array");
	imp=obj.nextInt();}while(imp!=1 && imp!=2);
	if(imp==1)
	{
		do{
		int c=menu(obj);
		
		switch(c)
		{
		case 1:
			b.push(obj);
			break;
		case 2:
			b.pop();
			break;
		case 3:
			b.displayAll();
			break;
		case 4:
			b.displayTop();
			break;
		}
		}while(true);
	}
	else if(imp==2)
	{
		for(int i=0 ; i<countarray ;i++)
		{
			bkary[i] = new Book();
		}
		do {
		int c=menu(obj);
		switch(c)
		{
		case 1:
			count=bkary[0].inputAtStart(count, bkary, obj);
			break;
		case 2:
			count=bkary[0].removeBook(count, bkary);
			break;
		case 3:
			for(int i=0 ; i<count ; i++)
			{
				bkary[i].display();
			}
			break;
		case 4:
			bkary[0].display();
			break;
		}
		}while(true);
	}
}
}
