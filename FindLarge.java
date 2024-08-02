 
import java.util.Scanner;
public class FindLarge{
// prepare a Logic to findout Large digit in given Number
  // If Number is 1782 The Largest Digit is 8 You should prepare logic to print that Number
  // Take Number By using Scanner
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = scan.nextInt();
    int temp = 0;
    while(a > 0)
    {
      int rem = a % 10;
      if(rem > temp)
      {
        temp = rem;
        
      }
      a = a/10;
      
    }
    System.out.println(temp);
  }
  }
