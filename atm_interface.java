// Atm Interface Generator 

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;
public class atm_interface
 {
public static Scanner sc = new Scanner(System.in);
public static ArrayList<String> record = new ArrayList<>();

// "totalBal" function displays the totalBaltion history for the user
public static void totalBal(int balance) 
{
for (String i : record) {
System.out.println(i);
}
ask(balance);
 }
// Login fuction will check if the username or login password is valid or not

public static void login(String username, int pin)
 {
if (username.contains("Abhishek") && pin == 3700) 
{
record.add("Logged in");
ask(6000);
} else {
System.out.println("Enter valid info!");
System.out.print("Username followed by pin seperated with a space: ");
 login(sc.next(), sc.nextInt());
}
}

/*  "withdraw" -> function allows the user to withdraw a specified amount from their
  account */
public static void withdraw(int balance, int amount) 
{
 if (amount <= balance && amount >= 0)
 {
balance -= amount;
System.out.println("Transaction successful, Current balance is " + balance);
record.add("Rupee/'s " + amount + " withdrawn.");
 ask(balance);
    }
 else
 {
      System.out.print("Enter a valid amount(greater than equal to 0): ");
      withdraw(balance, sc.nextInt());
    }
  }

// "deposit" to deposit a specified amount into their account
public static void deposit(int balance, int amount) 
{
if (amount >= 0) {
 balance += amount;
System.out.println("Transaction successful, Current balance is " + balance);
record.add(amount + " ruppee/'s deposited!");
 ask(balance);
} else {
 System.out.print("Enter a valid amount(greater than equal to 0): ");
 deposit(balance, sc.nextInt());
 }
 }

 // "transfer" function allows the user to transfer a specified amount to another
// user's account
 public static void transfer(int balance, int amount)
 {
 if ((amount <= balance) && (amount >= 0)) 
{
 System.out.print("Enter reciver's username: ");
String accname = sc.next();
 balance -= amount;
 System.out.println(amount + " rupee/s sent to " + accname);
 System.out.println("Transaction successful, Current balance is " + balance);
 record.add(amount + " transfered to account " + accname);
ask(balance);
 } else {
 System.out.print("Enter a valid amount(greater than equal to 0): ");
  transfer(balance, sc.nextInt());
 }
  }

 // "exit" to exit the program
public static void exit(int balance, char qresponse) 
{
 if (qresponse == 'y' || qresponse == 'Y') 
{
 System.out.println("---------------Logged out---------------");
      System.out.println();
    } else
      ask(balance);
  }

  // ask -> function presents the user with a record of options and allows them to
  // Choose One Of The Options
  public static void ask(int bal) 
{
    System.out.println("----------------------------------------");
    System.out.println();
    System.out.println("1) Transaction History");
    System.out.println("2) Withdraw");
    System.out.println("3) Deposit");
    System.out.println("4) Transfer");
    System.out.println("5) Quit");
    System.out.print("Choose one of the following actions: ");
    int opt = sc.nextInt();
    System.out.println();
    if (1 > opt || opt > 5) {
      System.out.println("Enter valid input!");
      ask(bal);
    } else {
      switch (opt) {
        case 1:
          System.out.println("----------Transaction history!----------");
          totalBal(bal);
          break;

        case 2:
          System.out.print("Enter amount to be withdrawn: ");
          withdraw(bal, sc.nextInt());
          break;

        case 3:
          System.out.print("Enter amount to be deposited: ");
          deposit(bal, sc.nextInt());
          break;

        case 4:
          System.out.print("Enter amount to be transfered: ");
          transfer(bal, sc.nextInt());
          break;

        case 5:
          System.out.print("Do you want to exit?(Yes/No): ");
          char qresponse = sc.next().charAt(0);
          exit(bal, qresponse);
          break;
      }
    }
  }

  public static void main(String[] args) {
    System.out.println();
    // Use username as Given'Abhishek'
    System.out.println("Use pin as '3700 for testing!");
    System.out.println("---------------*Login!*---------------");
    System.out.print("Enter user name: ");
    String username = sc.next();
    System.out.print("Enter pin: ");
    int pin = sc.nextInt();
    login(username, pin);
  }
}
