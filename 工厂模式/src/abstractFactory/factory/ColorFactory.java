package abstractFactory.factory;

import abstractFactory.Blue;
import abstractFactory.Color;
import abstractFactory.Green;
import abstractFactory.Red;
import simpleFactory.Shape;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
