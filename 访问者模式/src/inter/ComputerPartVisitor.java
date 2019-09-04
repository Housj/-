package inter;

import impl.Computer;
import impl.Keyboard;
import impl.Monitor;
import impl.Mouse;

/**
 * @author sergei
 * @create 2019-09-03
 */
public interface ComputerPartVisitor {

    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);

}
