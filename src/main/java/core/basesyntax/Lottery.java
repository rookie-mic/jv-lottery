package core.basesyntax;
import java.util.Random;

public class Lottery {
    public int number = 100;
    public Random random = new Random();
    public ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(), random.nextInt(number));
    }
}
