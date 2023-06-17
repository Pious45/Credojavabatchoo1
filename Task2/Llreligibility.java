import java.time.LocalDate;

class LLREligibility {
    public static void main(String[] args) {
        int minimumAge = 18; // Minimum age requirement for LLR

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Example birthdate to check eligibility
        LocalDate birthdate = LocalDate.of(2000, 1, 1);

        // Calculate the age based on the current date and birthdate
        int age = currentDate.getYear() - birthdate.getYear();

        // Check if the person is eligible for LLR
        boolean isEligible = age >= minimumAge;

        if (isEligible) {
            System.out.println("You are eligible for Learner's License.");
        } else {
            System.out.println("You are not eligible for Learner's License.");
        }
    }
}
