package singleton;

/** 懒汉式 线程不安全
 * @author sergei
 * @create 2019-09-01
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
