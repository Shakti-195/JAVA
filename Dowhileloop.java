import java.util.*;
public class Main {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  System.out.println("Enter Your Marks Out of 100:");
  
  int marks=sc.nextInt();
  if(marks >=90){
    do{
      System.out.println("This is Good");
    }while(marks<90);
      
  }else if(marks >=60){
    System.out.println("This is also Good");
    
     }else if(marks >=30){
    System.out.println("This is Good as well ");
     }else{
    System.out.println("This is not Good");
     }
}
}
    