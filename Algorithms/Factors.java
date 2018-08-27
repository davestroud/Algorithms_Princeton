public class Factors {
  public static void main(String[] args) {

    // command-line arguement
    long n = Long.parseLong(args[0]);

    System.out.print("The prime factorization of " + n + " is: ");

    // for the potential factor
    for (long factor = 2; factor*factor <= n; factor++) {

      // if factor is a factor of n, repeatedly divide it out
      while (n % factor == 0) {
        System.out.print(factor + " ");
        n = n / factor;
      }
    }

    // if biggest factor occurs only once, n > 1
    if (n > 1) System.out.println(n);
    else       System.out.println();
  }
}
