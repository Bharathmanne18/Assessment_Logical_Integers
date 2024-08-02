 public class FindOdd{
    public static void main(String[] args) {
      String num = "122456";
      System.out.println("Digits in odd positions are:");
      for (int i = 0; i < num.length(); i++) {
          if ((i + 1) % 2 != 0) {  
              System.out.println(num.charAt(i));
          }
        }
      
      
    }
    
  }
  
