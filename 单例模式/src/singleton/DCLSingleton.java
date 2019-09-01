package singleton;

/** 双检锁/双重校验锁(double checked locking)
 * @author sergei
 * @create 2019-09-01
 */
public class DCLSingleton {
    private volatile static DCLSingleton singleton;

    private DCLSingleton(){}

    public static DCLSingleton getInstance(){
        if (singleton == null){
            synchronized (DCLSingleton.class){
                if (singleton == null){
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }

}
