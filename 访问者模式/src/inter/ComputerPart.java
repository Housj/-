package inter;

/**
 * @author sergei
 * @create 2019-09-03
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
