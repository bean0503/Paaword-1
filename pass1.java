import java.util.*;
public class pass1{
    public static void main(String args[]){
        String[]possible = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int origin = (int)(Math.random()*26);
        String password = possible[origin];
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("password:");
            String input = sc.nextLine();
            if(password.equals(input)){
                System.out.println("login correct");
                break;
            }
            System.out.println("login incorrect");
        }
    }
}