import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissor {
    static void myGame(String comp,String me){
        if(comp.equals("r")&&me.equals("p")){
            System.out.println("You Win");
        }
        else if(comp.equals("r") && me.equals("s")){
            System.out.println("You Loose");
        }
        else if(comp.equals("p")&&me.equals("r")){
            System.out.println("You Loose");
        }
        else if(comp.equals("p") && me.equals("s")){
            System.out.println("You Win");
        }
        else if(comp.equals("s")&&me.equals("p")){
            System.out.println("You Loose");
        }
        else if(comp.equals("s")&& me.equals("r")){
            System.out.println("You Win");
        }
        else{
            System.out.println("Game Draw");
        }
    }
    public static void main(String[] args){
        String comp,me;
        while(true){
            System.out.println("****** Rock Paper Scissor Game ******");
            Scanner inp = new Scanner(System.in);
            System.out.println("Comp has chosen (r,p,s)");
            System.out.println("Enter 'r' for Rock, 'p' for Paper and 's' for Scissor or enter q for Quiting the Game");
            me = inp.nextLine();
            Random rand = new Random();
            int rand_num = rand.nextInt(3);
            if(rand_num==1){
                comp = "r";
            }
            else if(rand_num==2){
                comp = "p";
            }
            else{
                comp="s";
            }
            if(me.equals("q")){
                System.out.println("I Quit");
                break;
            }
            myGame(comp, me);
            System.out.println("-----------------------");
            System.out.println("Computers Response: "+ comp);
            System.out.println("My Response: "+ me);
            System.out.println("-----------------------");
            }
    }
}