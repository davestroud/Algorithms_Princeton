import java.util.Arrays;

public class Playground {
  public static void main(String[] args) {
    int[] a = {9, 3, 9, 3, 9, 7, 9};
    int n = 7;
    System.out.println(Arrays.toString(a));

    // print array values, one per line
    System.out.println("a[]");
    System.out.println("--------------");
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }

    System.out.println();
    System.out.println("a = " + a);
    System.out.println();

    // find the maximum
    double max = Double.NEGATIVE_INFINITY;
    for (int i = 0; i < a[i]; i++) {
        if (a[i] > max) max = a[i];
    }
    System.out.println("max = " + max);

    // average
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
        sum += a[i];
    }
    System.out.println("average = " + sum / a.length);

    // copy to another array
        double[] b = new double[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
    }

    // reverse the order
    for (int i = 0; i < n/2; i++) {
      double temp = b[i];
      b[i] = b[n-i-1];
      b[n-i-1] = temp;
    }

    // print array values, one per line
        System.out.println();
        System.out.println("b[]");
        System.out.println("-------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
        System.out.println();

        // dot product of a[] and b[]
        double dotProduct = 0.0;
        for (int i = 0; i < n; i++) {
            dotProduct += a[i] * b[i];
        }
      System.out.println("dot product of a[] and [b] = " + dotProduct);
  }
}
