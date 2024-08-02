public class FindOdd{
  // Prepare a Logic to print odd didgit in anumber
    // Example if we have taken Number 122456 it should return digits which are in odd position in this number it should retrun odd placed values 
    // 1 
    // 2
    // 5
    // This will be the output since they are in odd positions
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
  