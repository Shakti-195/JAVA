import java.util.Scanner;
public class spiritual{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println ("Enter the Number:");
int a =sc.nextInt();
if(a>=0){
    System.out.println("You are Astik"+" "+"Jai Shri Ram /Jai Shri Hanuman");
}
else if(a<0){
    System.out.println("You are Nastik"+" "+"Go to Hell");
    }
  }
}


output:
Enter the Number:
1
You are Astik Jai Shri Ram /Jai Shri Hanuman

Enter the Number:
-1
You are Nastik Go to Hell
