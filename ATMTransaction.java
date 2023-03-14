                             // ATM Interface Project 
                             //ABHISHEK KUMAR PATHAK

import java.util.Scanner;

public class ATMTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( " Use Account Number 1234567890 For Testing ");
        System.out.println(" Use Pin 1234");
        
        // Prompt user to enter account number and PIN
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter PIN: ");
        int pin = scanner.nextInt();
        
        // Authenticate account number and PIN
        boolean isAuthenticated = authenticate(accountNumber, pin);
        if (!isAuthenticated) {
            System.out.println("Authentication failed.");
            return;
        }
        
        // Prompt user to select transaction type
        System.out.println("Select transaction type:");
        System.out.println("1. Withdrawal");
        System.out.println("2. Deposit");
        System.out.println("3. Check balance");
        System.out.println("4. Transfer");
        System.out.println("5. Exit\n");
        int transactionType = scanner.nextInt();
        
        // Perform transaction based on user selection
        double balance = 100000 ; // Change this as per your requirement
        switch (transactionType) {

            case 1:
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = scanner.nextDouble();
                balance = withdraw(balance, withdrawalAmount);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                balance = deposit(balance, depositAmount);
                break;

            case 3:
                System.out.println("Your balance is: " + balance);
                break;
            default:
                System.out.println("Invalid transaction type selected.");
                break;

                case 4:
                System.out.print("Enter Transfered amount: ");
                double transferAmount = scanner.nextDouble();
                balance = transfer(balance, transferAmount);
                break;

                case 5:
                System.out.println( " Thanks For Using Our ATM . Have A Nice Day ");
                System.exit(0); 
            

        }
        
        // Print remaining balance
        System.out.println("Remaining balance: " + balance);
    }
    
    // Authenticate account number and PIN
    public static boolean authenticate(String accountNumber, int pin) {
        // Replace this with your authentication logic
        return accountNumber.equals("1234567890") && pin == 1234;
    }
    
    // Withdraw money from account
    public static double withdraw(double balance, double withdrawalAmount) {
        if (balance >= withdrawalAmount) {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
        return balance;
    }
    
    // Deposit money into account
    public static double deposit(double balance, double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit successful.");
        return balance;
    }
     // Transfered money from account
     public static double transfer(double balance, double transferAmount) {
        if (balance >= transferAmount) {
            balance -= transferAmount;
            System.out.println(" Transfer successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
        return balance;
    }
}

                   // THANK YOU 
                   // ****---  ABHISHEK KUMAR PATHAK ---****
                   
