class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println("Count: " + i);
        }
        System.out.println("Loop ended.");
    }
}
