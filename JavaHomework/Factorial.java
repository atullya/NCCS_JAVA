package JavaHomework;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    int num;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    num = scan.nextInt();
    int f = factorial(num);
    System.out.println("The factorial of " + num + " is " + f);
    scan.close();

  }

  static int factorial(int num) {
    if (num == 0 || num == 1) {
      return 1;
    }
    return num * factorial(num - 1);
  }
}
