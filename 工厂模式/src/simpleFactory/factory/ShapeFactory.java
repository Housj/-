package simpleFactory.factory;

import simpleFactory.Circle;
import simpleFactory.Rectangle;
import simpleFactory.Shape;
import simpleFactory.Square;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
