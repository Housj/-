package internetweather;

/**
 * @author sergei
 * @create 2019-09-01
 */
public interface Observer {
    public void update(float temperatrue,float pressure,float humidity);
}
