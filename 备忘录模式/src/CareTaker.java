import java.util.ArrayList;
import java.util.List;

/**
 * @author sergei
 * @create 2019-09-03
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
