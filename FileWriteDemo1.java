import java.util.Scanner;   // Needed for Scanner class
import java.io.*;           // Needed for File I/O classes

/**
   This program writes data to a file. It makes sure the specified file does not exist before opening it for writing.
*/
public class FileWriteDemo1 {
   public static void main(String[] args) throws IOException {
      String[] mssgs = new String[] { "How many friends do you have? ", "Enter the filename: ", "The file ",
            " already exists. Bye!!!", "Enter the name of friend ", "number ", "Data written to the file." };

      String filename, friendName;
      int numFriends;
      File file;
      PrintWriter print2File;
      Scanner keyboard = new Scanner(System.in);

      System.out.print(mssgs[0]);
      numFriends = keyboard.nextInt();
      keyboard.nextLine(); // Consume the remaining newline character.

      System.out.print(mssgs[1]);
      filename = keyboard.nextLine();
      file = new File(filename);

      if (file.exists()) { // Make sure the file does not exist.
         System.out.println(mssgs[2] + filename + mssgs[3]);
         System.exit(0);
      }

      print2File = new PrintWriter(file);

      for (int i = 1; i <= numFriends; i++) {
         System.out.print(mssgs[4] + mssgs[5] + i + ": ");
         friendName = keyboard.nextLine();
         print2File.println(friendName); // Write the name to the file.
      }

      print2File.close(); // Close the file.
      System.out.println(mssgs[6]);
   }
}
