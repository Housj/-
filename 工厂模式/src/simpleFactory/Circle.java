package simpleFactory;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
