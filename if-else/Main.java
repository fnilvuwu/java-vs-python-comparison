public class Main {
    public static void main(String[] args) {
        int score = 80;
        char grade;
        if (score >= 80) {
            grade = 'A';
        } else if (score >= 75) {
            grade = 'B';
        } else if (score >= 65) {
            grade = 'C';
        } else {
            grade = 'E';
        }
        System.out.println("Your grade is " + grade);
    }
}
