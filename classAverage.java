public class classAverage {

    //Method to calculate class average using two scores
    public static double calculateClassAverage(double score1, double score2) {
        return (score1 + score2) / 2;
    }

    //Method to calculate class average using three scores
    public static double calculateClassAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }

    //Method to calculate class average using an array of scores
    public static double calculateClassAverage(double[] scores) {
        double total = 0;

        for (double score : scores) {
            total += score;
        }

        return total / scores.length;
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println(calculateClassAverage(67, 84));
        System.out.println(calculateClassAverage(77, 51, 90));

        double[] scores = {62, 50, 78, 45, 88};
        System.out.println(calculateClassAverage(scores));
    }
}
