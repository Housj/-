package fly;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("--- BadFly ---");
    }
}
