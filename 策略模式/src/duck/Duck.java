package duck;

import fly.FlyBehavior;
import quack.QuackBehavior;

/**
 * @author sergei
 * @create 2019-09-01
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    Duck(){

    }

    public abstract void display();

    public void swim(){
        System.out.println(" ~~ im swim ~~");
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
