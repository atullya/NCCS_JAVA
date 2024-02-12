package JavaHomework.MethodOverriding;

public class Square {
  public double area(double length, double breadth) {
    double a = length * breadth;
    return a;
  }

  public double perimeter(double length, double breadth) {
    double p = 2 * (length + breadth);
    return p;
  }

  void display(double area, double perimeter) {
    System.out.println("The area of square is " + area + " and the perimeter is " + perimeter);
  }

  public static void main(String[] args) {
    System.out.println();
  }
}

class Rectangle extends Square {
  @Override
  public double area(double length, double breadth) {
    double a = length * breadth;
    return a;
  }

  @Override
  public double perimeter(double length, double breadth) {
    double p = length + breadth;
    return p;
  }

  void display(double area, double perimeter) {
    System.out.println("The area of Rectangle is " + area + " and the perimeter is " + perimeter);
  }

  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    double aa = r1.area(12, 13);
    double pp = r1.perimeter(12, 14);
    r1.display(aa, pp);
    Square s1 = new Square();
    double sarea = s1.area(122, 122);
    double sperimerter = s1.area(122, 122);
    s1.display(sarea, sperimerter);
  }
}
