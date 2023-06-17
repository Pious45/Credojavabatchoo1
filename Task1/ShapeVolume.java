class VolumeCalculator {
    public static void main(String[] args) {
        double sideLength = 5.0;
        double cubeVolume =  sideLength * sideLength * sideLength;
        System.out.println("Cube Volume: " + cubeVolume);

        double radius = 3.0;
        double sphereVolume =(4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Sphere Volume: " + sphereVolume);
    }

    
}
