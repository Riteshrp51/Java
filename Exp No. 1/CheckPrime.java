import java.util.*;

public class CheckPrime {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number to check prime: ");
      int n = sc.nextInt();
      int m = (int) Math.sqrt(n);
      boolean prime = true;
      if (n == 0 || n == 1) {
         prime = false;
      }
      if (n == 2) {
         prime = true;
      }
      for (int i = 2; i <= m; i++) {
         if (n % i == 0) {
            prime = false;
         }
      }
      if (prime == true) {
         System.out.print("Given number is prime.");
      } else {
         System.out.print("Given number is not prime.");

      }
   sc.close();

   }

}