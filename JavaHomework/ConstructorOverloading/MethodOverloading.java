package JavaHomework.ConstructorOverloading;

public class MethodOverloading {
  public static void main(String[] args) {
    int res = add(1, 2);
    int res1 = add(1, 2, 3);
    int res2 = add(1, 2, 3, 4);
    System.out.println("After adding 2 number using add(par1,par2) is=" + res);
    System.out.println("After adding 2 number using add(par1,par2,par3) is= " + res1);
    System.out.println("After adding 2 number using add(par1,par2,par3,par4) is=" + res2);
  }

  public static int add(int a, int b) {
    int c = a + b;
    return c;
  }

  public static int add(int a, int b, int c) {
    int d = a + b + c;
    return d;
  }

  public static int add(int a, int b, int c, int d) {
    int e = a + b + c + d;
    return e;
  }
}
