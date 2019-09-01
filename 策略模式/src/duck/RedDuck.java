package duck;

import fly.BadFlyBehavior;
import fly.GoodFlyBehavior;
import quack.GaGaQuackBehavior;
import quack.GeGeQuackBehavior;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class RedDuck extends Duck {

    public RedDuck(){
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GeGeQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("** RedHead **");
    }
}
