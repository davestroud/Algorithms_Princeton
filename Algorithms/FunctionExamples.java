/******************************************************************************
 *  Compilation:  javac FunctionsExamples.java
 *  Execution:    none
 *
 *  Examples of functions.
 *
 ******************************************************************************/

public class FunctionExamples {

  // absolute value of an int value
  public static int abs(int x) {
    if (x < 0) return -x;
    else       return x;
  }

  // absolute value of a double value (overloading)
  public static double abs(double x) {
    if (x < 0) return -x;
    else       return x;
  }

  // primality test (multiple return statements)
  public static boolean isPrime(int n) {
    if (n < 2) return false;
    for (int i = 2; i <=n/i; i++)
        if (n % i == 0) return false;
    return true;
  }

  // hypotenuse of a right triangle (muliple arguements)
  // see also Math.hypot()
  public static double hypotenuse(double a, double b) {
    return Math.sqrt(a*a + b*b);
  }

  public static void main(String[] args) {
  }
}
