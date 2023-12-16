
package book;

import java.util.Scanner;

public class stack {
	
		Book start;
		
		public void push(Scanner obj)
		{
			Book b = new Book();
			b.input(obj);
			b.next=start;
			start=b;
		}
		
		public void pop()
		{
			if(start==null)
			{
				System.out.println("Enpty List!");
			}
			else {
			start=start.next;}
		}
		
		public void displayAll() {
			if(start==null)
			{
				System.out.println("Enpty List!");
			}
			else {
				Book t =start;
				while(t!=null)
				{
					t.display();
					t=t.next;
				}
			}
		}
		public void displayTop()
		{
			if(start==null)
			{
				System.out.println("Enpty List!");
			}
			else {
				start.display();
			}
		}
		
	}