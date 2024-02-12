package JavaHomework;

import java.util.Scanner;

public class Ticketbooth {
  int no_of_people_visited, total_amount;
  int ticket_sold_count = 0;
  final int ticket_price = 250;

  public Ticketbooth() {
    no_of_people_visited = 0;
    total_amount = 0;
  }

  public static void main(String[] args) {
    Ticketbooth t1 = new Ticketbooth();
    int n;
    int choice;
    Scanner scan = new Scanner(System.in);
    while (true) {
      System.out.println("Enter 1 to buy ticket");
      System.out.println("Enter 2 to just visit");
      System.out.println("Enter 3 to display information");
      System.out.println("Enter 4 to display number of ticket sold and it's amount");
      System.out.println("Enter 5 to exit");
      choice = scan.nextInt();
      switch (choice) {
        case 1:
          t1.buyTicket();

          break;
        case 2:
          t1.justVisit();
        case 3:
          t1.display();
          break;
        case 4:
          t1.totalSoldAmount();
          break;
        case 5:
          return;

        default:
          System.out.println("Invalid Input!");
          break;

      }
    }
  }

  public void buyTicket() {
    ++no_of_people_visited;
    total_amount = total_amount + ticket_price;
    ++ticket_sold_count;
  }

  public void justVisit() {
    ++no_of_people_visited;

  }

  public void display() {
    System.out.println("Total no of people visited is:" + no_of_people_visited);
    System.out.println("Total ticket sold is:" + ticket_sold_count);
  }

  public void totalSoldAmount() {
    System.out.println("Total ticket sold is:" + ticket_sold_count);
    System.out.println("Total amount is :" + total_amount);

  }
}
