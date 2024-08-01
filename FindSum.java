import java.util.Scanner;
public class FindSum{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    String a=sc.nextLine();
    int sum=0;
    for(int i=1;i<=a.length();i++){
      int n=Character.getNumericValue(a.charAt(i-1));
      int temp=0;
      for(int j=1;j<=i;j++){
    
        if(i%j==0){
          temp++;
        }
      }
      if(temp==2){
        sum=sum+n;
      }
    }
    System.out.println(sum);
    }
    }
    


  
// Prepare a Logic to Findout the Sum of Prime Placed Digits
  // Example if we take 34578 as a Number we should consider 3+5+8=16 it should print 16 as Answer
  // LikeWise Prepare a Logic to find out sum at prime placed Integer
  // Take Number Using Scanner

