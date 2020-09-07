package game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperSciossor {

    public static void Computer(String[] choices, String str){

        int random = (int) (Math.random() * choices.length);
        System.out.println(choices[random]);


        if (str.equals(choices[random])){
            System.out.println("Tie");
        }else if (choices[random].equals(choices[0]) && str.equals(choices[1])){
            System.out.println("Paper won Rock lose");
        }else if (choices[random].equals(choices[0]) && str.equals(choices[2])){
            System.out.println("Rock won Scissor Lose");
        }else if (choices[random].equals(choices[1]) && str.equals(choices[2])){
            System.out.println("Scissor won paper lose");
        }else if (choices[random].equals(choices[1]) && str.equals(choices[0])){
            System.out.println("paper won Rock lose");
        }else if (choices[random].equals(choices[2]) && str.equals(choices[0])){
            System.out.println("Rock win Scissor lose");
        }else if (choices[random].equals(choices[2]) && str.equals(choices[1])){
            System.out.println("Scissor won paper lose");
        }
    }

    public static void main(String... args){

        String[] choices = {"Rock", "Paper", "Scissor"};
        Scanner scan = new Scanner(System.in);
        System.out.println("choose one -- Rock-Paper-Scissor --");
        String str = scan.nextLine();

        Computer(choices, str);




    }
}
