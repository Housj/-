import duck.Duck;
import duck.GreenDuck;
import duck.RedDuck;
import fly.NoFlyBehavior;

public class Main {

    public static void main(String[] args) {

        Duck greenDuck = new GreenDuck();
        Duck redDuck = new RedDuck();

        greenDuck.display();
        greenDuck.fly();
        greenDuck.quack();
        greenDuck.swim();

        redDuck.display();
        redDuck.fly();
        redDuck.setFlyBehavior(new NoFlyBehavior());
        redDuck.fly();
        redDuck.quack();
        redDuck.swim();
    }
}
