class NumberChecker {
    public static void main(String[] args) {
        String input = "12345"; // Example input to check

        if (isNumber(input)) {
            System.out.println(input + " is a number.");
        } else {
            System.out.println(input + " is not a number.");
        }
    }

    public static boolean isNumber(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
