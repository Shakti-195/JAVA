import java.util.Scanner;
public class Main{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int length,breadth,height;
    int totalarea,volume;

    System.out.println("Enter the length,breadth and height of the cuboid");
    length=sc.nextInt();
    breadth=sc.nextInt();
    height=sc.nextInt();

    totalarea=2*(length*breadth+breadth*height+height*length);
    volume=length*breadth*height;
    System.out.println("TotalArea ="+" "+totalarea);
    System.out.println("volume ="+" "+volume);
    
    
  }
}
