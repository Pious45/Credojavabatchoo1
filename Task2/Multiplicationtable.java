class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5; // Number for which multiplication table is generated
        int tableSize = 10; // Number of rows in the multiplication table

        // Print the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= tableSize; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
