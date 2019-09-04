package 单纯享元;

import 单纯享元.inter.Circle;
import 单纯享元.inter.Shape;

import java.util.HashMap;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
