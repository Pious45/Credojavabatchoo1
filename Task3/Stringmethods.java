class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // length()
        int length = str.length();
        System.out.println("Length: " + length);

        // charAt()
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // substring()
        String substring = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substring);

        // indexOf()
        int indexOfComma = str.indexOf(",");
        System.out.println("Index of comma: " + indexOfComma);

        // lastIndexOf()
        int lastIndexOfSpace = str.lastIndexOf(" ");
        System.out.println("Last index of space: " + lastIndexOfSpace);

        // contains()
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        // startsWith()
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        // endsWith()
        boolean endsWithExclamation = str.endsWith("!");
        System.out.println("Ends with '!': " + endsWithExclamation);

        // replace()
        String replacedString = str.replace("World", "Universe");
        System.out.println("Replaced 'World' with 'Universe': " + replacedString);

        // toLowerCase()
        String lowercase = str.toLowerCase();
        System.out.println("Lowercase string: " + lowercase);

        // toUpperCase()
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase string: " + uppercase);

        // trim()
        String trimmedString = str.trim();
        System.out.println("Trimmed string: " + trimmedString);

        // split()
        String[] parts = str.split(",");
        System.out.println("Split string parts: ");
        for (String part : parts) {
            System.out.println(part);
        }

        // isEmpty()
        boolean isEmpty = str.isEmpty();
        System.out.println("Is string empty: " + isEmpty);

        // startsWith(prefix, startIndex)
        boolean startsWithL = str.startsWith("L", 3);
        System.out.println("Starts with 'L' at index 3: " + startsWithL);

        

        // compareTo()
        int comparisonResult = str.compareTo("Hello, Universe!");
        System.out.println("Comparison result: " + comparisonResult);

        // equals()
        boolean isEqual = str.equals("Hello, World!");
        System.out.println("Is string equal: " + isEqual);

        // equalsIgnoreCase()
        boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello, world!");
        System.out.println("Is string equal (ignore case): " + isEqualIgnoreCase);

        // substring(startIndex)
        String substringFromIndex = str.substring(7);
        System.out.println("Substring from index 7: " + substringFromIndex);

        // concat()
        String concatenatedString = str.concat(" Welcome");
        System.out.println("Concatenated string: " + concatenatedString);

        // split(delimiter, limit)
        String[] partsWithLimit = str.split(",", 2);
        System.out.println("Split string parts with limit 2: ");
        for (String part : partsWithLimit) {
            System.out.println(part);
        }

        // replaceFirst()
        String replacedFirst = str.replaceFirst("o", "X");
        System.out.println("Replaced first 'o' with 'X': " + replacedFirst);

        // replaceAll()
        String replacedAll = str.replaceAll("o", "X");
        System.out.println("Replaced all 'o' with 'X': " + replacedAll);

        // matches()
        boolean matchesRegex = str.matches("Hello.*");
        System.out.println("Matches regex 'Hello.*': " + matchesRegex);

        
    }
}
