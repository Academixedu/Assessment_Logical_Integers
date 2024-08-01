
// Prepare a Logic to find out that a Digit in a Number should be Even Digit and Print Even Digit
  // 1298
  // if we take above number it should print 2 and 8 because both are even digits in a number
  
public class Scanner{
    public static void main(String[] args) {
        int number = 1342557898;
        String numStr = Integer.toString(number);
        

        for (char ch : numStr.toCharArray()) {
        
            int digit = Character.getNumericValue(ch);
            
           
            if (digit % 2 == 0) {
                System.out.print("even digit is " +digit );
            }
            else{
                System.out.println(" the odd  digit is "+digit); 
            }
        }
     
    }
      
       
    }



