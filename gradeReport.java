public class gradeReport {

    public static boolean validateScore(double score) {
        return score >= 0 && score <= 100;
    }

    public static String calculateLetterGrade(double score) {
        if (score >= 80) {
            return "A";
        } else if (score >= 75) {
            return "B+";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 65) {
            return "C+";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 55) {
            return "D+";
        } else if (score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void displayPerformanceMessage(String grade) {
        switch (grade) {
            case "A":
                System.out.println("Outstanding");
                break;
            case "B+":
                System.out.println("Very good");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C+":
                System.out.println("Fairly Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D+":
                System.out.println("Weak");
                break;
            case "D":
                System.out.println("Very Weak");
                break;
            case "F":
                System.out.println("Fail");
                break;
        }
    }

    public static void executeGradeReport(double score) {
        if (!validateScore(score)) {
            System.out.println("Invalid Score");
            return;
        }

        String grade = calculateLetterGrade(score);
        displayPerformanceMessage(grade);
    }

    public static void main(String[] args) {
        executeGradeReport(73);
        executeGradeReport(210);
    }
}
