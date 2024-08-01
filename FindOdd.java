import java.util.Scanner;

public class FindOdd{
// Prepare a Logic to print odd didgit in anumber
  // Example if we have taken Number 122456 it should return digits which are in odd position in this number it should retrun odd placed values 
  // 1 
  // 2
  // 5
  // This will be the output since they are in odd positions
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
  System.out.println("enter number : ");
  String a=s.nextLine();
  int sum=0;
  for(int i=1;i<=a.length();i++){
    int n=Character.getNumericValue(a.charAt(i-1));
    if(i%2==1){
  System.out.println(n);
       
    }
  }
  
  }
  
}

