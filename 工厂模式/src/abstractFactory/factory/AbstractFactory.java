package abstractFactory.factory;

import abstractFactory.Color;
import simpleFactory.Shape;

/**
 * @author sergei
 * @create 2019-09-01
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
