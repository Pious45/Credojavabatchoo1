class LargestNumber {
    public static void main(String[] args) {
        int largest;

        // Example with two numbers
        int num1 = 10;
        int num2 = 20;
        largest = num1 > num2 ? num1 : num2;
        System.out.println("Largest number among " + num1 + " and " + num2 + " is: " + largest);

        // Example with three numbers
        int num3 = 30;
        largest = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("Largest number among " + num1 + ", " + num2 + " and " + num3 + " is: " + largest);

        // Example with four numbers
        int num4 = 40;
        largest = num1 > num2 ? (num1 > num3 ? (num1 > num4 ? num1 : num4) : (num3 > num4 ? num3 : num4))
                             : (num2 > num3 ? (num2 > num4 ? num2 : num4) : (num3 > num4 ? num3 : num4));
        System.out.println("Largest number among " + num1 + ", " + num2 + ", " + num3 + " and " + num4 + " is: " + largest);
    }
}
