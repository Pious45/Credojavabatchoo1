class NumberClassifier {
    public static void main(String[] args) {
        int number = -15; // Example number to classify

        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
