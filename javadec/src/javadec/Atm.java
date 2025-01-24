package javadec;
import java.util.*;
class Atm
{
	public static void main(String[]args)
	{
		int PIN,option, Balance;
		int main_balance= 10000;
		Balance = main_balance;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter PIN: ");
		PIN = input.nextInt();
		
		if(PIN==1234)
		{
			System.out.println("Press 1 for cash withdrawal");
   			System.out.println("Enter 2 for deposit amount");
   			System.out.println("Enter 3 for change pin");
   			System.out.println("Enter 4 check balance");
			
			System.out.print("Enter the option: "); 
			option = input.nextInt();
			switch(option)
			{
				case 1: 
					{
						System.out.print("Enter the amount: ");
						int cash_withdrawal = input.nextInt();
						Balance = main_balance - cash_withdrawal;
						System.out.println("The main balance is: "+Balance);
						break;	
					} 
				case 2:
					{
						System.out.print("Enter the amount: ");
						int deposit= input.nextInt();
						Balance = main_balance + deposit;
						System.out.println("The main balance is: "+Balance);
						break;
					}
				case 3: 
					{
						System.out.print("Enter the existing PIN: ");
						int existing_pin = input.nextInt();
						if(existing_pin == PIN)
						{
							System.out.print("Enter the new pin: ");
							int new_pin = input.nextInt();
							System.out.println("Your pin got changed successfully");
						}
						else
						{
							System.out.println("Please check your existing pin.");
						}
						break;
					}
				case 4:
					{
						System.out.println("Your balance is: "+Balance);
						break;
					}
				default: 
					{
						System.out.println("Please check your option.");
						break;
					} 
			}
		}
		else
		{
			System.out.println("Please check your PIN");
		}
	}
}




