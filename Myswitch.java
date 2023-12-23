import java.util.*;
public class Myswitch{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Menu");
    System.out.println("Add");
    System.out.println("Sub");
    System.out.println("Mul");
    System.out.println("Div");

    System.out.println("Enter 2 numbers");
    int x=sc.nextInt();
    int y=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter your option in words");
    String Option=sc.nextLine();
   // Option=Option.toUppercase();

    switch(Option){
      case "Add":System.out.println("sum is" + (x+y));
        break;
       case"Sub":System.out.println("difference is" + (x-y));
        break;
      case "Mul":System.out.println("Mul is" +(x*y));
        break;
      case "Div":System.out.println("Div is" +(x/y));
        break;
      default:System.out.println("Invalid option");
        break;
        

        
    }
  }
}

OUTPUT:

Menu
====
Add
Sub
Mul
Div
Enter 2 numbers
25
25
Enter your option in words
Mul
Mul is 625
