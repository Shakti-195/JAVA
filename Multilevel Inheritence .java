class Sports{
    void play(){
        System.out.println("Playing...");
    }
}
class Cricket extends Sports{
    void plays(){
        System.out.println("We Play using Bat and Ball!");
    }
}
class player extends Cricket{
    void batting(){
        System.out.println("Well Played!!");
        
    }
}
public class main{
    public static void main(String []args){
        player a=new player();
        a.batting();
        a.plays();
        a.play();
    }
}


Output:
Well Played!!
We Play using Bat and Ball!
Playing...
