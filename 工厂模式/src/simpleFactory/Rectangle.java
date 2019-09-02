package simpleFactory;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
