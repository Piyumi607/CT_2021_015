package Q_10;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter loan amount:");
        double loanAmount = scan.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = scan.nextDouble();

        System.out.print("Enter loan period (in years): ");
        int loanPeriod = scan.nextInt();

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = loanPeriod * 12;

        double monthly_Payment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        double total_Payment = monthly_Payment * numberOfPayments;

        System.out.printf("Monthly Payment: %.2f\n", monthly_Payment);
        System.out.printf("Total Payment: %.2f\n", total_Payment);
    }
}
