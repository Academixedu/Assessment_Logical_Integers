public class FindOdd{
// Prepare a Logic to print odd didgit in anumber
  // Example if we have taken Number 122456 it should return digits which are in odd position in this number it should retrun odd placed values 
  // 1 
  // 2
  // 5
  // This will be the output since they are in odd positions
    public static void main(String[] args) {
        int num = 122456;
        // 62879
        
        int reversedNum = 0;
        int originalNum = num;
        
        while (originalNum != 0) {
            int digit = originalNum % 10;
            reversedNum = reversedNum * 10 + digit;
            originalNum = originalNum / 10;
        }

       int position=1;
        
        while (reversedNum != 0) {
            int digit = reversedNum % 10; 
                       if (position % 2 != 0) { 
                System.out.println(digit);
            }
            reversedNum = reversedNum / 10; // Remove the last digit
            position++; // Move to the next position
        }
    }
  }
