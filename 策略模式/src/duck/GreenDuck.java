package duck;

import fly.GoodFlyBehavior;
import quack.GaGaQuackBehavior;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class GreenDuck extends Duck {

    public GreenDuck(){
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("** GeenHead **");
    }
}
