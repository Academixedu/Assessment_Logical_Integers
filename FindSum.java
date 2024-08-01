import java.util.Scanner;
public class FindSum{
// Prepare a Logic to Findout the Sum of Prime Placed Digits
  // Example if we take 34578 as a Number we should consider 3+5+8=16 it should print 16 as Answer
  // LikeWise Prepare a Logic to find out sum at prime placed Integer
  // Take Number Using Scanner
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter number");
    String number=sc.nextLine();
    int sum=0;
    
    for(int i=1;i<=number.length();i++){
      int n=Character.getNumericValue(number.charAt(i-1));
      int count=0;
      for(int j=1;j<=i;j++){
        if(i%j==0){
        count++;
        }
      }
    
    if(count==2){
      sum=sum+n;
      
    }
  }
  System.out.println(sum);
}
}
