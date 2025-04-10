import java.util.Scanner;
public class factorial{
  public static int factorial(int n) {
     if (n==0 || n==1)
      return 1;
    int fact =1;
   for( int i=2;i<=n;i++) {
      fact*=i;
 }
return fact;
}
 public static void main (String[] args){
   Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number :");
  int num=sc.nextInt();
  sc.close();
  System.out.println("Factorial of " + num +"is"+ factorial(num));
}
}