import impl.Computer;
import impl.ComputerPartDisplayVisitor;
import impl.Mouse;
import inter.ComputerPart;

/**
 * @author sergei
 * @create 2019-09-03
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {

        new Mouse().accept(new ComputerPartDisplayVisitor());

        ComputerPart computer = new Computer();

        //computer.accept(new ComputerPartDisplayVisitor());
    }
}
