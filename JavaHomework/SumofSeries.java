package JavaHomework;

import java.util.Scanner;

public class SumofSeries {
  public static void main(String[] args) {
    int x, n;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the value of x:");
    x = scan.nextInt();

    System.out.println("Enter the nth term for the series:");
    n = scan.nextInt();
    double sum = nthValue(x, n);

    System.out.println("The sum of series up to " + n + "th term is " + sum);

    scan.close();
   
  }

  static double nthValue(int x, int n) {

    double res = 1.0;
    // double factorial = 1.0;

    for (int i = 1; i <= n; i++) {
      // factorial *= i;
      res = res + (Math.pow(x, i) / factorial(i + 1));
    }
    return res;
  }

  static int factorial(int num) {
    if (num == 0 || num == 1) {
      return 1;
    }
    return num * factorial(num - 1);
  }
}
