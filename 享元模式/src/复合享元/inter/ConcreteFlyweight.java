package 复合享元.inter;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class ConcreteFlyweight implements Flyweight {

    private Character intrinsicState = null;

    public ConcreteFlyweight(Character state){
        this.intrinsicState = state;
    }
    @Override
    public void operation(String state) {
        System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + state);
    }
}
