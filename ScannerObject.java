import java.util.Scanner;

public class ScannerObject {
  // To take input from the user!!
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); // Create a Scanner object

    // Uncomment and modify the code below for other types of inputs

    // System.out.println("Enter an integer:");
    // int intValue = myObj.nextInt(); // Read integer input
    // System.out.println("Integer is: " + intValue);

    // System.out.println("Enter a float:");
    // float floatValue = myObj.nextFloat(); // Read float input
    // System.out.println("Float is: " + floatValue);

    // System.out.println("Enter a character:");
    // char charValue = myObj.next().charAt(0); // Read character input
    // System.out.println("Character is: " + charValue);

    System.out.println("Enter username:");
    String userName = myObj.nextLine(); // Read username input
    System.out.println("Username is: " + userName); // Output username input

    // Close the Scanner to prevent resource leak

    myObj.close();
  }
}
