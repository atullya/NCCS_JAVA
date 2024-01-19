public class VariableExample {
  // static float p=1,t=2,r=5;
  static float p1 = 100, t1 = 4, r1 = 33;

  public static void main(String[] args) {

    // This is for non static
    VariableExample v1 = new VariableExample();
    v1.NewInterest(p1, t1, r1);

    float p = 1, t = 2, r = 5;// local variable, no default value
    Interest(p, t, r);
  }

  // Staic -Method!
  static void Interest(float p, float t, float r) {
    float interest;
    interest = (p * t * r);
    System.out.println(interest);
    float si = interest / 100;
    System.out.println("The Interest is:" + si);
  }

  // Non-static Method
  void NewInterest(float p1, float t1, float r1) {
    float interest1;
    interest1 = (p1 * t1 * r1);
    System.out.println(interest1);
    float si1 = interest1 / 100;
    System.out.println("The Interest is:" + si1);
  }
}
