import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();

        if(s.trim().length() == 0 || s.trim().length() > 400000){
            System.out.println(0);
            return;
        }

        String input [] = s.trim().split("[ !,?.\\_'@]+");
        System.out.println(input.length);
        for (String word : input) {
            System.out.println(word);
        }
    }
}
