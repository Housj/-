package internetweather;

/**
 * @author sergei
 * @create 2019-09-01
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
