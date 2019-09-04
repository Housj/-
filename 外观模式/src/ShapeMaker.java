import 单纯享元.inter.Shape;
import 单纯享元.inter.impl.Circle;
import 单纯享元.inter.impl.Rectangle;
import 单纯享元.inter.impl.Square;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
