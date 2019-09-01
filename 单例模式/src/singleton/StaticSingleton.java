package singleton;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class StaticSingleton {
    private static class SingletonHolder{
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    private StaticSingleton(){}

    public static final StaticSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
