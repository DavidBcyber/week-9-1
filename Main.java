import java.util.Scanner;  // Import the Scanner class


public class Main {
  public static void main(String[] args) {
    System.out.println("Interest Calculator Program");

    Scanner myLoan = new Scanner(System.in);   //Scanner Object
    System.out.println("What is principal amount of loan in dollars?");
    
    int loan = myLoan.nextInt();

    System.out.println("What is interest rate (input 0.05 for 5%)?");
    double rate = myLoan.nextDouble();

    System.out.println("What is period of loan in years?");
    int years = myLoan.nextInt();

   System.out.println("Total intrest of Loan is:"  +loan * rate* years);
  }
}