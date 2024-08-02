 
import java.util.Scanner;
public class FindNum{
// Prepare a Logic to find out 2nd  number in a set of number 
  // Let's Take a Number in Scanner
  // Example if you take 235 as number it should return 3
  // Likewise Logic you have written should get 2nd digit of any number
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    String a = scan.nextLine();
    if(a.length() < 2)
    {
      System.out.println("The number should contain minimum 2 digits");
    }
    else
    {
      System.out.println(a.charAt(1));
    }
    
  }
}
