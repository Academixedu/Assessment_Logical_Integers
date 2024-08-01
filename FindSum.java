import java.util.Scanner;
public class FindSum{
// Prepare a Logic to Findout the Sum of Prime Placed Digits
  // Example if we take 34578
  // as a Number we should consider 4+5+8=16 it should print 16 as Answer
  // LikeWise Prepare a Logic to find out sum at prime placed Integer
  // Take Number Using Scanner

public static void main(String args[]){
  Scanner s=new Scanner(System.in);
System.out.println("enter number : ");
String a=s.nextLine();//44323//
int sum=0;
for(int i=1;i<=a.length();i++){
  int n=Character.getNumericValue(a.charAt(i-1));//4
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