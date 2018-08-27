public class ArrayExamples {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    // initialize to random values between 0 and 1
    double[] a = new double[n];
    for (int i = 0; i < n; i++) {
      a[i] = Math.random();
    }

    // print array values, one per line
    System.out.println("a[]");
    System.out.println("----------------");
    for (int i = 0; i < n; i++) {
    System.out.println(a[i]);
    }
    System.out.println();
    System.out.println("a = " + a);
    System.out.println();

    // find the maximum
    double max = Double.NEGATIVE_INFINITY;
    for (int i = 0; i < n; i++) {
      if (a[i] > max) max = a[i];
    }
    System.out.println("max = " + max);

    // average
    double sum = 0.0;
    for (int i = 0; i < n; i++) {
      sum += a[i];
    }
    System.out.println("average = " + sum / n);

  }
}
