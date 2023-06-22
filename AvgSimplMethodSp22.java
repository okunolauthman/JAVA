import java.util.Scanner;

public class AvgSimplMethodSp22 {
    public static void main(String[] args) {
        double grade = 0.0, accumulator = 0.0;
        double avg = 0.0;
        int counter = 0;
        boolean gotNumbers = false;
        String[] messages = new String[] {"\nEnd of Program!\n", "Enter a grade <= 100!"};

        grade = getNum(); // Get the first grade
        while (grade != 0) {
            if (grade > 100) {
                System.out.println(messages[1]); // Print an error message if the grade is greater than 100
            } else {
                accumulator = accum(grade, accumulator); // Add the grade to the accumulator
                counter = countr(counter); // Increment the counter
                if (counter == 1)
                    gotNumbers = true;
                prinout(accumulator, grade, counter); // Print the current sum and average
            }
            grade = getNum(); // Get the next grade
        }

        if (gotNumbers) {
            avg = averash(accumulator, counter); // Calculate the average
            prinout(avg, grade, counter); // Print the final average
        }

        System.out.println(messages[0]); // Print the end-of-program message
    }

    /*
     * Method Definitions
     */

    // Method to get a grade from the user
    public static double getNum() {
        String prompt = "\nEnter a grade to average, zero to stop: ";
        Scanner keyboard = new Scanner(System.in);
        double num1;
        System.out.print(prompt);
        num1 = keyboard.nextDouble();
        return num1;
    }

    // Method to accumulate the grades
    public static double accum(double dGrade, double dAccum) {
        return dAccum += dGrade;
    }

    // Method to increment the counter
    public static int countr(int dCounter) {
        return dCounter += 1;
    }

    // Method to calculate the average
    public static double averash(double dAkkum, int dKounter) {
        return dAkkum / dKounter;
    }

    // Method to print the sum or average
    public static void prinout(double num1, double dGrade, int dCount) {
        String[] messages = new String[] {"The Sum of the ", " grades equals ", "The average of the "};
        if (dGrade != 0)
            System.out.println("\n" + messages[0] + dCount + messages[1] + num1);
        else
            System.out.println("\n" + messages[2] + dCount + messages[1] + num1);
    }
}
