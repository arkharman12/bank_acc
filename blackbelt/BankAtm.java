import java.util.Scanner;

class BankAtm {
	private String accNumber;
	private String name;
	private long balance;

	Scanner KB = new Scanner(System.in);
	
	//open an account
	void openAccount()
	{ 
		System.out.print("Enter Account Number: ");
		accNumber = KB.next();
		System.out.print("Enter Name: ");
		name = KB.next();
		System.out.print("Enter Balance: ");
		balance = KB.nextLong();
	}

	//display account details
	void showAccount()
	{ 
		System.out.println(accNumber+","+name+","+balance);
	}

	//deposit money
	void deposit()
	{
		long amount;
		System.out.println("Enter much you want to deposit: ");
		amount = KB.nextLong();
		balance = balance+amount;
	}

	//withdraw money from the account
	void withdrawal()
	{
		long amount;
		System.out.println("Enter much you want to withdraw: ");
		amount = KB.nextLong();
		if(balance >= amount)
		{ 
			balance = balance - amount;
		}
		else
		{
			System.out.println("Transaction Failed. Your account doesn't have sufficient money to withdraw");
		}
	}

	//search an account number
	boolean search(String acn)
	{ 
		if(accNumber.equals(acn))
		{ 
			showAccount();
			return(true);
		}
		return(false);
	}
} //end BankAtm
