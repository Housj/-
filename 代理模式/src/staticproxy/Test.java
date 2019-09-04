package staticproxy;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class Test {

    public static void main(String[] args) {
        UserInfo userImpl = new UserImpl();
        UserProxy userProxy = new UserProxy(userImpl);
        userProxy.queryUser();
        userProxy.updateUser();
    }
}
