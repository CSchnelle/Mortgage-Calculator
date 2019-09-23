/** Project 05
 * Mortgage Calculator Program
 * Catherine Schnelle
 * 10/01/18
 */
import java.util.Scanner;
public class CatherineSchnelleProj05
{
   
    public static void main(String[] args){
        //delcared variables
        int numOfYears;
        double loanAmount;
        double annualInterestRate;
        
        //reads input from user
        java.util.Scanner input = new java.util.Scanner(System.in);  
        
        //prompts user to enter loan amount 
        System.out.print("Enter loan amount (ex:2500.00");
        loanAmount = input.nextDouble();
        
        //prompts user to enter loan term
        System.out.print("Enter loan term (ex: 6):");
        numOfYears = input.nextInt();
        
        //prompts user to enter annual interest rate
        System.out.print("Enter Annual Interest Rate: (ex: 7.25)");
        annualInterestRate = input.nextDouble();
        
        //calculates monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        
        //calculates monthly payment
        double monthlyPayment = loanAmount * monthlyInterestRate / 
        (1-(Math.pow(1/ (1+monthlyInterestRate), numOfYears*12)));
        
        //variables to print to user
        double balance = loanAmount;
        double interest;
        double principal;
        
        //displays these category amounts to user
        System.out.println("Loan Amount:" + loanAmount);
        System.out.println("Loan Term:" + numOfYears);
        System.out.println("Interest Rate:" + annualInterestRate);
        System.out.println();
        System.out.println("Monthly Payment:" + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("Total Payment:" + (int) (monthlyPayment * 12 * numOfYears * 100) / 100.0 + "\n");
        System.out.println("Payment#\tInterest\t\t\tPrincipal\t\t\tBalance");
        
        //for loop 
        for(int i = 1; i <= numOfYears * 12; i++){
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.println(i + "\t\t" + interest
            + "\t\t" + principal + "\t\t" + balance);
           
         
         //while loop
         /**
            int i = 1; 
            while(i <= numOfYears * 12){ 
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
              System.out.println(i + "\t\t" + interest
            + "\t\t" + principal + "\t\t" + balance);  
             i++;
          */     
         
       
        
        }
        
    }
}