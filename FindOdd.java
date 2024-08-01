import java.util.Scanner;

public class FindOdd{
// Prepare a Logic to print odd didgit in anumber
  // Example if we have taken Number 122456 it should return digits which are in odd position in this number it should retrun odd placed values 
  // 1 
  // 2
  // 5
  // This will be the output since they are in odd positions
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a given number");
    String number=sc.nextLine();
    for(int i=1;i<=number.length();i++){
        if(i%2!=0){  //1 -(q(0)*2=1-0=1)
          System.out.println(number.charAt(i-1));
        }
    }
    
  }
  
}
