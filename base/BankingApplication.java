import java.util.Scanner;

public class BankingApplication {
      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int options;
            double amount;
            double extraMoney;
            boolean exit = false;

            //using switch statements to get the desired results
            do {
                  System.out.println("\n1. Deposit money in Gold Checking (with 3% yearly interest rate)");
                  System.out.println("2. Deposit money in Silver Checking (with 1% yearly interest rate)");
                  System.out.println("3. Deposit money in Gold Savings (with 3% monthly interest rate)");
                  System.out.println("4. Deposit money in Silver Savings (with 1% monthly interest rate)");
                  System.out.print("\nEnter your choice, press 0 to exit: ");

                  options = in.nextInt(); //storing the user input in options

                  switch (options) {
                  case 1:
                        System.out.print("\nAmount to deposit: ");
                        amount = in.nextFloat(); //storing the amount of money user want to deposit
                        extraMoney = (amount * 3)/100; //calculating the interest rate

                        if (amount <= 0)
                             System.out.println("Can't deposit a negative amount.");
                        else {
                             extraMoney = extraMoney + amount;
                             System.out.println("$" + extraMoney + " has been deposited with  3% yearly interest rate.");
                        }
                        break;
                  case 2:
                        System.out.print("Amount to deposit: ");
                        amount = in.nextFloat(); //storing the amount of money user want to deposit
                        extraMoney = (amount * 1)/100; //calculating the interest rate

                        if (amount <= 0)
                             System.out.println("Can't deposit a negative amount.");
                        else {
                             extraMoney = extraMoney + amount;
                             System.out.println("$" + extraMoney + " has been deposited with 1% yearly interest rate.");
                        }
                        break;

                  case 3:
                        System.out.print("Amount to deposit: ");
                        amount = in.nextFloat(); //storing the amount of money user want to deposit
                        extraMoney = ((amount * 3)/100) * 12; //calculating the interest rate montly

                        if (amount <= 0)
                             System.out.println("Can't deposit a negative amount.");
                        else {
                             extraMoney = extraMoney + amount;
                             System.out.println("$" + extraMoney + " has been deposited with 3% monthly interest rate.");
                        }
                        break;

                  case 4:
                        System.out.print("Amount to deposit: ");
                        amount = in.nextFloat(); //storing the amount of money user want to deposit
                        extraMoney = ((amount * 1)/100) * 12; //calculating the interest rate monthly

                        if (amount <= 0)
                             System.out.println("Can't deposit a negative amount.");
                        else {
                             extraMoney = extraMoney + amount;
                             System.out.println("$" + extraMoney + " has been deposited with 1% monthly interest rate.");
                        }
                        break;

                  case 0:
                        exit = true; //let the user exit the program
                        break;

                  default:
                        System.out.println("Wrong choice.");
                        break;

                  }

                  System.out.println();
            }  
            while (!exit);
            System.out.println("Goodbye Human!");
            in.close();
      }
} //end BankingApplication
