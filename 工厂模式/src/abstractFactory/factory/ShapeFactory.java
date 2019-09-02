package abstractFactory.factory;

import abstractFactory.Color;
import simpleFactory.Circle;
import simpleFactory.Rectangle;
import simpleFactory.Shape;
import simpleFactory.Square;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
