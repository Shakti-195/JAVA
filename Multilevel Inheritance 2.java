class Sports{
    void outdoor(){
        System.out.println("Which sport you want to play ");
    }
}
class Cricket extends Sports{
    void batball(){
        System.out.println("I want to play Cricket choose to bat first");
    }
}
class Football extends Cricket{
    void soccerball(){
        System.out.println("I want to play as Forward player");
    }
}
public class main{
    public static void main(String[]args){
        Football f=new Football();
        f.soccerball();
        f.batball();
        f.outdoor();
    }
}
output:

I want to play as Forward player
I want to play Cricket choose to bat first
Which sport you want to play 
