public class forEach {
  public static void main(String[] args) {
    int a[] = new int[10];
    for (int i = 0; i < 10; i++) {
      a[i] = i * 5;
    }
    for (int res : a) {

      System.out.println("Output=>" + res);
    }
  }
}
