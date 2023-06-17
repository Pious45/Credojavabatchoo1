class SimpleInterestCalculator {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.05; // 5% interest rate
        int time = 3; // 3 years

        double simpleInterest = principal*rate *time;
        double totalAmount = principal + simpleInterest;

       
        System.out.println("Simple Interest: $" + simpleInterest);
        System.out.println("Total Amount: $" + totalAmount);
    }

    
}
