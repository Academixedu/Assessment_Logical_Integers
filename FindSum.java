import java.util.Scanner;
public class FindSum{
// Prepare a Logic to Findout the Sum of Prime Placed Digits
  // Example if we take 34578 as a Number we should consider 3+5+8=16 it should print 16 as Answer
  // LikeWise Prepare a Logic to find out sum at prime placed Integer
  // Take Number Using Scanner
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a Num:");
    int num=s.nextInt();
    
  SumPrime(num);


  }
  public static void SumPrime(int num){
    int digit ;
    int sum=0;
    while(num!=0){
    digit=num%10;
    if(!(digit%2==0)){
      System.out.print(digit+"+");
       sum=sum+digit;
       
    }
    num=num/10;

    }
    System.out.println("="+sum);
  }

}
