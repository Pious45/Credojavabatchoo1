import java.util.Scanner;

class LetterWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int letterCount = countLetters(sentence);
        int wordCount = countWords(sentence);

        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of words: " + wordCount);
    }

    public static int countLetters(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}
