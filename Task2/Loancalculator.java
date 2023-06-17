class LoanCalculator {
    public static void main(String[] args) {
        double loanAmount = 100000; // Loan amount in dollars
        double interestRate = 5.0; // Annual interest rate
        int loanDuration = 5; // Loan duration in years

        // Calculate monthly interest rate
        double monthlyInterestRate = interestRate / 100 / 12;

        // Calculate number of monthly payments
        int numberOfPayments = loanDuration * 12;

        // Calculate monthly payment using the formula:
        // M = P * r * (1 + r)^n / ((1 + r)^n - 1)
        double monthlyPayment = loanAmount * monthlyInterestRate *
                Math.pow(1 + monthlyInterestRate, numberOfPayments) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        // Print the monthly payment
        System.out.println("Monthly Payment: $" + monthlyPayment);
    }
}
