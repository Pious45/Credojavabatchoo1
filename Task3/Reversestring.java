class StringReverser {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }

    public static String reverseString(String str) {
        StringBuilder reversedStrBuilder = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStrBuilder.append(str.charAt(i));
        }

        return reversedStrBuilder.toString();
    }
}
