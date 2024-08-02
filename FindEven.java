import java.util.Scanner;
public class FindEven{
// Prepare a Logic to find out that a Digit in a Number should be Even Digit and Print Even Digit
  // 1298
  // if we take above number it should print 2 and 8 because both are even digits in a number


  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a Num:");
    int num=s.nextInt();
    
  findeven(num);


  }
  public static void findeven(int num){
    int digit ;
    
    while(num!=0){
    digit=num%10;
    if(digit%2==0){
      System.out.println(digit);
       
       
    }
    num=num/10;

    }
    
  }

}


