package core.basesyntax;

import java.util.Random;

public class Ball extends ColorSupplier {

    public int getRandomBallNumber() {
        Random randomBallNumber = new Random();
        return randomBallNumber.nextInt(101);
    }

    @Override
    public String toString() {
        String number = String.valueOf(getRandomBallNumber());
        return "Ball number is: " + number + " and color is: " + getRandomColor();
    }
}


