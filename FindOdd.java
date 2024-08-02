public class FindOdd{
// Prepare a Logic to print odd didgit in anumber
  // Example if we have taken Number 122456 it should return digits which are in odd position in this number it should retrun odd placed values 
  // 1 
  // 2
  // 5
  // This will be the output since they are in odd positions
  public static void main(String[] args) {
  String s="122456";
  for(int i=1;i<s.length();i++){
      int sd=Character.getNumericValue(s.charAt(i-1));
      if(i%2!=0){
          System.out.println(sd);
      }
    
  }

  }
}
