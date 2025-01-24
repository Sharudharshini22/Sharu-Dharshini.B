
package javadec;
import java.util.Scanner;
import java.util.LinkedList;

	class Book
	{
		String name;
		String author;
		boolean available;
	}
	class Procedure extends Book
	{
		  LinkedList<Book>B1=new LinkedList<>();
		  Scanner input=new Scanner(System.in);
		  Book B2=new Book();
		  
		  	void student()
		  	{	
		  		System.out.print("Enter Student name= ");
		  		String studentName=input.nextLine();
		  		System.out.print("Enter Student id= ");
		  		int id=input.nextInt();;
		  		System.out.println("Login Successfully!");	
		  	}
			void addbook(String name,String author)
			{	
			B2.name=name;
			B2.author=author;
			B2.available=true;
			B1.add(B2);
			System.out.println("---->Log in successfully and selected the book");
		}
			void display()
			{
				if(B1.isEmpty())
				{
					System.out.println("---->No books are available");
				}
				else
				{
					System.out.println("---->Books are available");
					for(Book data:B1)
					{
						System.out.println("Book name= "+data.name+ " , " +"Author name= "+data.author+" , "+"Availability= "+data.available+" ");	
					}
				}
			}
			void issue(String name)
			{
				for(Book data:B1)
				{
					if(data.name.equals(name))
					{
						if(data.available)
						{
							data.available=false;
							System.out.println("---->"+name+" = Book issued");
						}
						else
						{
							System.out.println("---->"+name+" = Book not issued");
						}
						return;
					}
				}
				System.out.println("---->Found error");	
			}
			void empty(String name)
			{
				for(Book data:B1)
				{
					if(data.name.equals(name))
					{
						if(!data.available)
						{
							data.available=true;
							System.out.println("---->"+name+" = Book Returned");
						}
						else
						{
							System.out.println("---->"+name+" = Book doesn't returned");
						}
						return;
					}
				}
				System.out.println("Found error");
			}		
	}

	class Library extends Procedure
	{
		Scanner input=new Scanner(System.in);
		void student()
	  	{	
			System.out.print("Enter Student name= ");
	  		String studentName=input.nextLine();
	  		System.out.print("Enter Student id= ");
	  		int id=input.nextInt();
	  		System.out.println("Logout successfully!");	
	  	}
		public static void main(String[] args) 
		{
			Scanner input=new Scanner(System.in);
			Library LM=new Library();
			Procedure P=new Procedure();
			while(true)
			{
				System.out.println("--------------------------");
				System.out.print("Enter info value= ");
				int info=input.nextInt();
				input.nextLine();
				switch (info)
				{
				case 1:
					P.student();
					System.out.print("Enter book name= ");
					String name=input.nextLine();
					System.out.print("Enter author name= ");
					String author=input.nextLine();
					P.addbook(name,author);
					break;
				case 2:
					P.display();
					break;
				case 3:
					System.out.print("Enter issued book= ");
					name=input.nextLine();
					P.issue(name);
					break;
				case 4:
					System.out.print("Enter returned book= ");
					name=input.nextLine();
					P.empty(name);
					break;
				case 5:
					LM.student();
					System.out.println("Closed");
					break;
				default:
					System.out.println("Invalid");		
				}
			}
		}
	}
	
