package singleton;

/** 饿汉式
 * @author sergei
 * @create 2019-09-01
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}
