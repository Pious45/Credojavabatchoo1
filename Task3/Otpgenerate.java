class OTPGenerator {
    public static void main(String[] args) {
        int otpLength = 6;
        String otp = generateOTP(otpLength);
        System.out.println("Generated OTP: " + otp);
    }

    public static String generateOTP(int length) {
        StringBuilder otpBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int digit = (int) (Math.random() * 10);
            otpBuilder.append(digit);
        }

        return otpBuilder.toString();
    }
}
