package impl;

import inter.ComputerPart;
import inter.ComputerPartVisitor;

/**
 * @author sergei
 * @create 2019-09-03
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
