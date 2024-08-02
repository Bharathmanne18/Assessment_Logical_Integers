 

import java.util.Scanner;
// Prepare a Logic to Findout the Sum of Prime Placed Digits
  // Example if we take 34578 as a Number we should consider 3+5+8=16 it should print 16 as Answer
  // LikeWise Prepare a Logic to find out sum at prime placed Integer
  // Take Number Using Scanner
  public class FindSum {
      
      // Function to check if a number is prime
      public static boolean isPrime(int n) {
          if (n <= 1) return false;
          if (n == 2) return true; // 2 is the only even prime number
          if (n % 2 == 0) return false; // Other even numbers are not prime
          for (int i = 3; i <= Math.sqrt(n); i += 2) {
              if (n % i == 0) return false;
          }
          return true;
      }
  
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter a number: ");
          String number = scanner.nextLine();
  
          int sum = 0;
          for (int i = 0; i < number.length(); i++) {
              int position = i + 1; // 1-based index
              if (isPrime(position)) {
                  sum += Character.getNumericValue(number.charAt(i));
              }
          }
  
          System.out.println("Sum of digits at prime positions: " + sum);
         
      }
  }
  
