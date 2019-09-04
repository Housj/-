package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class UserHandler implements InvocationHandler {

    private UserInfo userImpl;
    public UserHandler(UserInfo userImpl){
        this.userImpl = userImpl;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("UserHandler---invoke()");
        Object object = null;
        if (method.getName().equals("queryUser")){
            object = method.invoke(userImpl,args);
            //***
        }
        //***
        return object;
    }
}
