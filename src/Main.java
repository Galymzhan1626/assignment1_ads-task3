import java.util.Scanner;
 class Main {
     // Returns true if n is prime, else return false.
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