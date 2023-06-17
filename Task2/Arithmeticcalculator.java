class ArithmeticCalculator {
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 5.2;
        char operator = '*';

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The result of subtraction is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result of division is: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
