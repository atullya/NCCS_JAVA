package JavaHomework;

import java.util.Scanner;

public class Multiplication {
  public static void main(String[] args) {
    int n;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value of n:");
    n = scan.nextInt();
    mul(n);
    
    scan.close();
  }

  static void mul(int n) {
    for (int i = 1; i <= 20; i++) {
      System.out.println(n + " * " + i +" = " + n * i);
    }
  }
}
