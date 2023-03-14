//import required classes and packages   
import java.util.Scanner;  
      
//create ATMExample class to implement the ATM functionality  
public class ATM_Machine  
{  
    //main method starts   
    public static void main(String args[] )  
    {  
        //declare and initialize balance, withdraw, and deposit  
        int balance =1000500,transfer , withdraw, deposit;  
          
        //create scanner class object to get choice of user  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("ATM Machine\n");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for  Transfer"); 
            System.out.println("Choose 5 for EXIT\n"); 
            System.out.print("Choose the operation:");  
              
            //get choice from user  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                      
        //get the withdrawl money from user  
        withdraw = sc.nextInt();  
                      
        //check whether the balance is greater than or equal to the withdrawal amount  
        if(balance >= withdraw)  
        {  
            //remove the withdrawl amount from the total balance  
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            //show custom error message   
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        //get deposite amount from te user  
        deposit = sc.nextInt();  
                      
        //add the deposit amount to the total balanace  
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:  
        //displaying the total balance of the user  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
        case 4:  
        System.out.print("Enter money to be Transfer:");  
                      
        //  Transfer Money  
        transfer = sc.nextInt();  
                      
        //check whether the balance is greater than or equal to the Transfered amount  
        if(balance >= transfer)  
        {  
            //remove the transfer amount from the total balance  
            balance = balance - transfer;  
            System.out.println(" Transfer Sucessful");  
        }  
        else  
        {  
            //show custom error message   
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  

                case 5:  
        //exit from the menu  
        System.out.println( " Thanks For Using Our ATM . Have A Nice Day ");
        System.exit(0);  
            }  
        }  
    }  
}
    
