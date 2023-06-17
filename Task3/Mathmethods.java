class MathMethodsExample {
    public static void main(String[] args) {
        double x = 4.7;
        double y = -2.9;

        // Absolute value
        double absX = Math.abs(x);
        System.out.println("Absolute value of x: " + absX);

        // Ceiling value
        double ceilX = Math.ceil(x);
        System.out.println("Ceiling value of x: " + ceilX);

        // Floor value
        double floorX = Math.floor(x);
        System.out.println("Floor value of x: " + floorX);

        // Maximum value
        double max = Math.max(x, y);
        System.out.println("Maximum value between x and y: " + max);

        // Minimum value
        double min = Math.min(x, y);
        System.out.println("Minimum value between x and y: " + min);

        // Power
        double powerX = Math.pow(x, 2);
        System.out.println("x raised to the power of 2: " + powerX);

        // Square root
        double sqrtY = Math.sqrt(Math.abs(y));
        System.out.println("Square root of absolute value of y: " + sqrtY);

        // Random number between 0 and 1
        double random = Math.random();
        System.out.println("Random number between 0 and 1: " + random);
    }
}
