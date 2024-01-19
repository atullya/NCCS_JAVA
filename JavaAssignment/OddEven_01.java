import java.util.Scanner;

public class OddEven_01 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num;
    System.out.print("Enter the number:");
    num = scan.nextInt();
    CheckOddEven(num);
    scan.close();
  }

  static void CheckOddEven(int num) {
    if (num % 2 == 0) {
      System.out.println(num + " is a even number.");
    } else {

      System.out.println(num + " is a odd number.");
    }
  }
}
