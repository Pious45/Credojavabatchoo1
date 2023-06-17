import java.util.Scanner;

class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();
        
        String category;
        if (age < 18) {
            category = "Kid";
        } else if (age < 60) {
            category = "Adult";
        } else if (age < 80) {
            category = "Citizen";
        } else {
            category = "Senior Citizen";
        }
        
        System.out.println("Your age category is: " + category);
    }
}
