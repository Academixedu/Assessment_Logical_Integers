import java.util.Scanner;
public class FindLarge{
// prepare a Logic to findout Large digit in given Number
  // If Number is 1782 The Largest Digit is 8 You should prepare logic to print that Number
  // Take Number By using Scanner
  public  static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int a=sc.nextInt();
    int maxDigit=0;
    int b;
    while(a>0){
        b=a%10;
        if(b>maxDigit){
        maxDigit=b;
        }
        a=a/10;
    }
    System.out.println(maxDigit);
  } 
  }
