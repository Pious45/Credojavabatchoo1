import java.util.Scanner;

class MobileNumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a mobile number: ");
        String mobileNumber = scanner.nextLine();

        boolean isValid = false;

        if (mobileNumber.length() == 10) {
            char firstDigit = mobileNumber.charAt(0);
            if (firstDigit == '9' || firstDigit == '8' || firstDigit == '7') {
                boolean isAllDigits = true;
                for (int i = 1; i < mobileNumber.length(); i++) {
                    if (!Character.isDigit(mobileNumber.charAt(i))) {
                        isAllDigits = false;
                        break;
                    }
                }
                isValid = isAllDigits;
            }
        }

        if (isValid) {
            System.out.println("Valid mobile number.");
        } else {
            System.out.println("Invalid mobile number.");
        }
    }
}
