package dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class Test {

    public static void main(String[] args) {
        UserInfo userImpl = new UserImpl();
        UserHandler userHandler = new UserHandler(userImpl);
        UserInfo userProxy = (UserInfo)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{UserInfo.class},userHandler);
        userProxy.queryUser();
    }
}
