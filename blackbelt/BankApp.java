
import java.util.Scanner;

public class BankApp {  
	public static void main(String arg[])
	{
		Scanner KB = new Scanner(System.in);
		
		//create initial accounts
		System.out.print("\n\nEnter the number of accounts you want to create: ");

		int x = KB.nextInt();

		BankAtm  C[] = new BankAtm[x];
		for (int i = 0; i < C.length; i++)
		{   
			C[i] = new BankAtm();
			C[i].openAccount();
		}
		
		//this loop will keep running until 5 is pressed
		int ch;
		do
		{
			System.out.println("\n\nMain Menu\n");
			System.out.println("1.Display All");
			System.out.println("2.Search By Account");
			System.out.println("3.Deposit");
			System.out.println("4.Withdraw");
			System.out.println("5.Exit\n");
			
			System.out.println("Enter Your Choice :");
			ch = KB.nextInt();
			switch(ch)
			{ 
				case 1:
					for(int i = 0; i < C.length; i++)
					{
						C[i].showAccount();
					}
					break;

				case 2:
					System.out.print("Enter the Account Number you want to search for: ");
					String accN = KB.next();
					boolean found = false;
					for(int i = 0; i < C.length; i++)
					{  
						found = C[i].search(accN);
						if(found)
						{
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed! This Account doesn't exist");
					}
					break;

				case 3:
					System.out.print("Enter Account No : ");
					accN = KB.next();
					found = false;
					for(int i = 0; i < C.length; i++)
					{  
						found = C[i].search(accN);
						if(found)
						{
							C[i].deposit();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed! This Account doesn't exist");
					}
					break;

				case 4:
					System.out.print("Enter Account No : ");
					accN = KB.next();
					found = false;
					for(int i = 0; i < C.length; i++)
					{  
						found = C[i].search(accN);
						if(found)
						{
							C[i].withdrawal();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed! This Account doesn't exist");
					}
					break;

				case 5:
					System.out.println("Good Bye Human!");
					break;
				
				default:
					System.out.println("Wrong choice.");
					break;
			}
		}
		while(ch != 5);
		KB.close();
	}
} //end BankApp
