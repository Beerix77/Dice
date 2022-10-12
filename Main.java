import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("*** Welcome to DICE roller!! ***");
        System.out.print("Enter number of sides of dice: ");
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        DiceRoller dice = new DiceRoller();
        dice.roll(num);
    }
}