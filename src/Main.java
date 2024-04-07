import java.util.Scanner;
/**
 * The Main class contains methods to check if a number is prime.
 */
 class Main {
      /**
     * This method checks if a number 'n' is prime.
     * It uses recursion to test divisibility starting from the integer 'i'.
     * The base cases handle when 'n' is less than or equal to 2 and when 'i' squared is greater than 'n'.
     * If 'n' is divisible by 'i', it is not prime. If 'i' squared is greater than 'n', 'n' is prime.
     *
     * @param n The integer to check for primality.
     * @param i The current divisor being tested, starting with 2.
     * @return true if 'n' is prime, false otherwise.
     */
     static boolean isPrime(int n, int i) {
         // Base cases
         if (n <= 2)
             return (n == 2) ? true : false;
         if (n % i == 0)
             return false;
         if (i * i > n)
             return true;

         // Check for next divisor
         return isPrime(n, i + 1);
     }

     // Driver program to test above function
     public static void main(String[] args) {
                Scanner scan =new Scanner(System.in);

                int n = scan.nextInt();

                if (isPrime(n, 2))
                    System.out.println("yes");
                else
                    System.out.println("no");
     }
 }
