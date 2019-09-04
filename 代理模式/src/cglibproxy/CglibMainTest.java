package cglibproxy;


/**
 * @author sergei
 * @create 2019-09-02
 */
public class CglibMainTest {

    public static void main(String[] args) {
        Engineer engineerProxy = (Engineer) CglibProxy.getProxy(new Engineer());
        engineerProxy.eat();
    }
}
