 class ShapeAreaCalculator {
    public static void main(String[] args) {
        

        // Circle
        double radius = 5.0;
        double circleArea =Math.PI * radius * radius;
        System.out.println("Circle Area: " + circleArea);

        // Square
        double sideLength = 7.0;
        double squareArea = sideLength * sideLength;
        System.out.println("Square Area: " + squareArea);

        // Rectangle
        double length = 4.0;
        double width = 6.0;
        double rectangleArea = length * width;
        System.out.println("Rectangle Area: " + rectangleArea);

        // Triangle
        double base = 5.0;
        double height = 8.0;
        double triangleArea =  0.5 * base * height;
        System.out.println("Triangle Area: " + triangleArea);

        // Parallelogram
        double baseLength = 6.0;
        double Height = 9.0;
        double parallelogramArea = baseLength *Height;
        System.out.println("Parallelogram Area: " + parallelogramArea);

        // Trapezoid
        double base1 = 5.0;
        double base2 = 7.0;
        double trapezoidHeight = 4.0;
        double trapezoidArea = 0.5 * (base1 + base2) * trapezoidHeight;
        System.out.println("Trapezoid Area: " + trapezoidArea);

        // Pentagon
        double SideLength = 6.0;
        double Apothem = 5.0;
        double pentagonArea = 0.5 * 5 * SideLength * Apothem;
        System.out.println("Pentagon Area: " + pentagonArea);

        // Hexagon
        double hexagonSideLength = 8.0;
        double hexagonArea = (3 * Math.sqrt(3) * hexagonSideLength * hexagonSideLength)/2;
        System.out.println("Hexagon Area: " + hexagonArea);
    }
}

