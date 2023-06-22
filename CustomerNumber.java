import javax.swing.JOptionPane;

public class CustomerNumber {
   public static void main(String args[]) {
      boolean goodSoFar = true;  // Flag to track if the input is valid so far
      boolean badLength = true; // Flag to track if the length of the input is invalid
      boolean badLetr = true;   // Flag to track if any of the first three characters are not letters
      boolean badNum = true;    // Flag to track if any of the last four characters are not digits
      int i = 0;                // Counter variable
      String input;             // Variable to store user input

      // Prompt the user to enter a customer number in a specific format
      input = JOptionPane.showInputDialog("Enter a customer number in the form LLLNNNN\n" +
                                          "(LLL = letters and NNNN = numbers)\n" +
                                           "(Enter zero to stop!)");

      // Continue processing until the user enters '0'
      while (input.charAt(0) != '0') {
         // Check the length of the input
         if (input.length() != 7) {
            goodSoFar = false; // Invalid input
            badLength = false; // Set the flag to indicate invalid length
         }

         // Check the first three characters (letters)
         while (goodSoFar && i < 3) {
            if (!Character.isLetter(input.charAt(i))) {
               goodSoFar = false; // Invalid input
               badLetr = false;  // Set the flag to indicate invalid letter(s)
            }
            i++;
         }

         // Check the last four characters (digits)
         while (goodSoFar && i < 7) {
            if (!Character.isDigit(input.charAt(i))) {
               goodSoFar = false; // Invalid input
               badNum = false;   // Set the flag to indicate invalid digit(s)
            }
            i++;
         }

         // Display appropriate messages based on the validation results
         if (goodSoFar) {
            JOptionPane.showMessageDialog(null, input + " is a valid customer number.");
         } else if (!badLetr) {
            JOptionPane.showMessageDialog(null, "One or more of the first three characters is not a letter! " + input);
         } else if (!badNum) {
            JOptionPane.showMessageDialog(null, "One or more of the last four digits is not a number! " + input);
         } else if (!badLength) {
            JOptionPane.showMessageDialog(null, "The length of your customer number is not 7. You entered " +
                                                input.length() + " characters: " + input);
         }

         // Reset flags, counter, and get a new input from the user
         goodSoFar = true;
         badLength = true;
         badLetr = true;
         badNum = true;
         i = 0;
         input = JOptionPane.showInputDialog("Enter a customer number in the form LLLNNNN\n" +
                                              "(LLL = letters and NNNN = numbers)\n" +
                                              "(Enter zero to stop!)");
      }

      // Display end of execution message and exit the program
      JOptionPane.showMessageDialog(null, "End of execution!");
      System.exit(0);
   }
}
