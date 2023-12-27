import java.util.*;
public class Main {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st element");
    int n=sc.nextInt();
    System.out.println("Enter 2nd element");
    int m=sc.nextInt();
    for(int i=1; i<=n;i++){
      for(int j=1;j<=m-i;j++){
        
          System.out.print("*");
         System.out.print("   ");
      }System.out.println(" ");
    }
  
  }
  


}