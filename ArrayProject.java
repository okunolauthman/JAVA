public class ArrayProject {
    public static void main(String args[]) {
        // Declare variables
        String honorific = "";
        int[] pyRate = {8, 9, 11, 13, 18, 20, 15, 21}; // Array of pay rates
        char[] gender = {'F', 'M', 'M', 'M', 'M', 'M', 'M', 'F'}; // Array of genders
        String[] employees = {"Stacy", "Kyaw", "Shamar", "Uthman", "Adetunji", "Donald", "Samuel", "Davina"}; // Array of employee names

        // Iterate over the arrays and print employee information
        System.out.println("");
        for (int i = 0; i < 8; i++) {
            // Determine the honorific based on gender
            if (gender[i] == 'M') {
                honorific = "\nhis";
            } else {
                honorific = "\nher";
            }

            // Print employee information using concatenation
            System.out.println("employees[" + i + "] is " + employees[i] +
                    honorific + "  pyRate[" + i + "] is $" + pyRate[i] + " per hour.");

            // Print employee information using formatted string
            System.out.printf("%13s%s%s$%d%s%n%n", "The Employee ", employees[i], " makes ",
                    pyRate[i], " per hour.");
        }

        // Print statements outside the for-loop
        System.out.println("Left the for-loop!");
        System.out.println("End of Program!\n");
    }
}
