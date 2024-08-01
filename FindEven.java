import java.util.Scanner;
public class FindEven{
// Prepare a Logic to find out that a Digit in a Number should be Even Digit and Print Even Digit
  // 1298
  // if we take above number it should print 2 and 8 because both are even digits in a number



  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter number : ");
    int a= s.nextInt();
    while(a!=0){
      int rem=a%10;
      if(rem%2==0){
        System.out.println(rem);
      }

    }
  }

}




