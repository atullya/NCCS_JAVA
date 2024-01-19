import java.util.Scanner;

public class PositiveNegative {
  static int number;

  public static void main(String[] args) {
    PositiveNegative p1 = new PositiveNegative();
    Scanner scan = new Scanner(System.in);
    p1.inputFromUser(scan);
    p1.checkPositiveNegative();
    scan.close();
  }

  void inputFromUser(Scanner Scan) {
    System.out.print("Enter the number:");
    number = Scan.nextInt();

  }

  void checkPositiveNegative() {
    if (number < 0) {
      System.out.println(number + " is negative number");
    } else {

      System.out.println(number + "is a positive number");
    }
  }
}
