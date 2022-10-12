import java.util.Random;
public class DiceRoller {

    Random random = new Random();

    void roll(int sides){

        int number = random.nextInt(sides)+1;
        System.out.println("Your " + sides + " sided dice rolled: " + number);
    }
}
