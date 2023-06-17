class PatternPrinter {
    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        printPattern1();

        System.out.println("\nPattern 2:");
        printPattern2();

        System.out.println("\nPattern 3:");
        printPattern3();

        System.out.println("\nPattern 4:");
        printPattern4();

        System.out.println("\nPattern 5:");
        printPattern5();

        System.out.println("\nPattern 6:");
        printPattern6();

        System.out.println("\nPattern 7:");
        printPattern7();

        System.out.println("\nPattern 8:");
        printPattern8();

        System.out.println("\nPattern 9:");
        printPattern9();

        System.out.println("\nPattern 10:");
        printPattern10();

        System.out.println("\nPattern 11:");
        printPattern11();

        System.out.println("\nPattern 12:");
        printPattern12();
    }

    public static void printPattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern2() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern5() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int l = 1; l < i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern6() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("* ");
            }
            for (int l = 5; l > i; l--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern7() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern8() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern9() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern10() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern11() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j - 1) + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern12() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j - 1) + " ");
            }
            System.out.println();
        }
    }
}
