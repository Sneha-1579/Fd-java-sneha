public class Grade {
    public static void main(String[] args) {
        int score = 85;
        String grade;
        if (score >= 95) {
            grade = "O";
        } else if (score >= 90) {
            grade = "A+";
        } else if (score >= 85) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B+";
        } else if (score >= 75) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C+";
        } else if (score >= 65) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D+";
        } else if (score >= 55) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("The grade for score " + score + " is: " + grade);
    }
    
}
