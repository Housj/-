package abstractFactory;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
