class StudentResult {
    public static void main(String[] args) {
        int[] marks = {60, 40, 50, 30, 70}; // Example marks for 5 subjects
        int passMark = 35; // Minimum pass mark

        int totalMarks = 0;

        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];
        }

        System.out.println("Total Marks: " + totalMarks);

        boolean isPass = true;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < passMark) {
                isPass = false;
                break;
            }
        }

        if (isPass) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
