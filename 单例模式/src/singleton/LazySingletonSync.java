package singleton;

/** 懒汉式，线程安全
 * @author sergei
 * @create 2019-09-01
 */
public class LazySingletonSync {

    private static LazySingletonSync instance;

    private LazySingletonSync(){}

    public static synchronized LazySingletonSync getInstance(){
        if (instance == null){
            instance = new LazySingletonSync();
        }
        return instance;
    }
}
