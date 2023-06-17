class StrongNumberExample {
    public static void main(String[] args) {
        int number = 145;
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            int factorial = getFactorial(digit);
            sum += factorial;
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a strong number.");
        } else {
            System.out.println(originalNumber + " is not a strong number.");
        }
    }

    public static int getFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
