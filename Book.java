
package book;

import java.util.Scanner;

public class Book {
int bid;
double bprice;
String btitle;
Book next;

public void input(Scanner obj)
{
	System.out.println("Enter book id: ");
	bid=obj.nextInt();
	System.out.println("Enter price of book: ");
	bprice=obj.nextDouble();
	System.out.println("Enter title of book: ");
	btitle=obj.next();
}
public int inputAtStart(int count,Book[] b,Scanner obj)
{
	if(count>=b.length)
	{
		System.out.println("Stackoverflow");
	}
	else {
	for(int i=count ; i>0 ; i--)
	{
		b[i]=b[i-1];
	}
	b[0]=new Book();
	b[0].input(obj);
	count ++;
	}
	return count;
}
//public int inputAtStart(int count,Book[] b,Scanner obj)
//{
//	if(count>b.length)
//	{
//		System.out.println("stackoverflow");
//	}
//	else {
//		for(int i=count;i>0;i--) {
//			b[i]=b[i-1];
//		}
//		b[0]=new Book();
//		b[0].input(obj);
//		count ++;
//		}
//	return count;
//}
public int removeBook(int count,Book[] b)
{
	if(count==0)
	{
		System.out.println("stackunderflow");
	}
	else {
	for(int i=0 ; i<=count ; i++)
	{
		b[i]=b[i+1];
	}
	b[count-1]= new Book();
	count --;
	}
	return count;
}

public void display()
{
	System.out.println("Book id is: "+bid
			+"\nBook price is: "+bprice
			+"\nBook title is: "+btitle+"\n\n");
}

}