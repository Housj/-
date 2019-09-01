package quack;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class NoQuackBehavior implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("--- NoQuack ---");
    }
}
