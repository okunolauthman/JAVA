import java.util.Scanner; // Import the Scanner class for user input
import java.io.*; // Import the necessary classes for file operations

/**
 * This program reads data from a file.
 */
public class FileWriteReadSp22 {
    public static void main(String[] args) throws IOException {
        String[] messages = new String[] {
            "Enter the filename: ",
            "\nThe file ",
            " exists! Here is its content!\n\n",
            " does NOT exist!",
            "\nEnd of Execution!\n"
        };

        Scanner keyboard, inputFile; // Declare Scanner objects for keyboard input and file input
        String filename = "", friendName = ""; // Declare variables to store the filename and friend name
        File file; // Declare a File object to represent the file
        boolean fileExists = false; // Flag to indicate whether the file exists

        keyboard = new Scanner(System.in); // Create a Scanner object for keyboard input
        System.out.print(messages[0]); // Prompt the user to enter the filename
        filename = keyboard.nextLine(); // Read the filename from the user

        file = new File(filename); // Create a File object initialized with the filename entered

        if (file.exists()) { // Check if the file exists
            System.out.println(messages[1] + filename + messages[2]); // Display a message indicating file existence
            fileExists = true; // Set the flag to true
        } else {
            System.out.println(messages[1] + filename + messages[3]); // Display a message indicating file non-existence
            System.exit(0); // Exit the program
        }

        inputFile = new Scanner(file); // Create a Scanner object for file input using the File object

        while (inputFile.hasNext()) { // Loop until there are no more lines in the file
            friendName = inputFile.nextLine(); // Read the next line from the file
            System.out.println(friendName); // Print the line (friend name) to the console
        }

        System.out.println(messages[4]); // Display end of execution message
        inputFile.close(); // Close the file
    }
}
