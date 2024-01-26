import java.util.Scanner;

public class ReadAndPrintSmallest {
  public static void main(String[] args) {
    int a[] = new int[3];
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      System.out.println("Enter " + i + "number:");
      a[i] = scan.nextInt();
    }
    int smallest = (a[0] < a[1]) ? (a[0] < a[2] ? a[0] : a[2]) : (a[1] < a[2] ? a[1] : a[2]);

    System.out.println("The smallest number is " + smallest);
    scan.close();
  }
}
