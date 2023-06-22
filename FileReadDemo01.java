import java.util.Scanner; // Needed for the Scanner class
import java.io.*;         // Needed for the File class

/**
 * This program reads data from a file but the drawback is it has to be in the same directory.
 */
public class FileReadDemo01 {
    public static void main(String[] args) throws IOException {
        // Array of messages for displaying prompts and information
        String[] mssgs = new String[] {
                "Enter the filename: ",
                "\nThe file ",
                " exists! Here is its content!\n\n",
                " does NOT exist!",
                "\nEnd of Execution!\n"
        };

        Scanner keyboard, inputFile; // Scanner objects for keyboard input and file input
        String filename = "", friendName = ""; // Variables to store the filename and friend name
        File file; // File object to represent the file
        boolean x_ists = false; // Flag to indicate whether the file exists

        keyboard = new Scanner(System.in); // Create a Scanner object for keyboard input
        System.out.print(mssgs[0]); // Prompt the user to enter the filename
        filename = keyboard.nextLine(); // Read the filename from the user
        file = new File(filename); // Create a File object initialized with the filename entered

        if (file.exists()) { // Check if the file exists
            System.out.println(mssgs[1] + filename + mssgs[2]); // Display a message indicating file existence
        } else {
            System.out.println(mssgs[1] + filename + mssgs[3]); // Display a message indicating file non-existence
            System.exit(0); // Exit the program
        }

        inputFile = new Scanner(file); // Create a Scanner object for file input using the File object

        while (inputFile.hasNext()) { // Read from the file until no more lines are left
            friendName = inputFile.nextLine(); // Read the next line from the file
            System.out.println(friendName); // Print the line (friend name) to the console
        }

        System.out.println(mssgs[4]); // Display end of execution message
        inputFile.close(); // Close the file
    }
}
