package JavaHomework;

public class Book {
  int book_id, pages;

  // public Book() {
  // }

  public Book(int book_id, int pages) {
    this.book_id = book_id;
    this.pages = pages;
  }

  void display() {
    System.out.println("The book id is " + book_id + " and the total pages in the book are " + pages);
  }
}

class FicitionBooks extends Book {
  // public FicitionBooks() {
  // }

  public FicitionBooks(int a, int b) {
    super(a, b);
  }

  public static void main(String[] args) {
    FicitionBooks f = new FicitionBooks(22, 22);
    f.display();
  }
}
