class CompoundInterestCalculator {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.05; // 5% interest rate
        int time = 3; // 3 years
        int compoundingFrequency = 1; // Annually

        double compoundInterest = principal * Math.pow((1 + (rate / compoundingFrequency)), (compoundingFrequency * time)) - principal;
        double totalAmount = principal + compoundInterest;

       
        System.out.println("Compound Interest: " + compoundInterest);
        System.out.println("Total Amount: " + totalAmount);
    }

}
