package equalityOperator;

public class ObjectEquality {
  public static void main(String[] args) {
    int a = 10, b = 20;
    ObjectEquality e = new ObjectEquality();
    ObjectEquality e1;//reference variable
    e1=e;
    System.out.println(e == e1);
  }
}
