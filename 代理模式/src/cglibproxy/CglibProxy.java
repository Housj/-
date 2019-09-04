package cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;
    public CglibProxy(Object target){
        this.target = target;
    }

    public static Object getProxy(Object target){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new CglibProxy(target));
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("---- before invocation");
        Object result = method.invoke(target,objects);
        System.out.println("---- end invocation");
        return result;
    }
}
