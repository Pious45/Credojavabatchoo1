import java.util.Scanner;

class NumberToWordConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String word = convertNumberToWord(number);
        System.out.println("Word representation: " + word);
    }

    public static String convertNumberToWord(int number) {
        if (number == 0) {
            return "zero";
        }

        if (number < 0) {
            return "minus " + convertNumberToWord(-number);
        }

        String word = "";

        String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };
        String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
        };
        String[] teens = {
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };

        if (number / 1000000 > 0) {
            word += convertNumberToWord(number / 1000000) + " million ";
            number %= 1000000;
        }

        if (number / 1000 > 0) {
            word += convertNumberToWord(number / 1000) + " thousand ";
            number %= 1000;
        }

        if (number / 100 > 0) {
            word += convertNumberToWord(number / 100) + " hundred ";
            number %= 100;
        }

        if (number >= 20) {
            word += tens[number / 10] + " ";
            number %= 10;
        } else if (number >= 10) {
            word += teens[number - 10] + " ";
            number = 0;
        }

        if (number > 0) {
            word += units[number] + " ";
        }

        return word.trim();
    }
}
