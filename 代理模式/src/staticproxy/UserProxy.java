package staticproxy;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class UserProxy implements UserInfo {

    private UserInfo userImpl;

    public UserProxy(UserInfo userImpl){
        this.userImpl = userImpl;
    }

    @Override
    public void queryUser() {
        System.out.println("UserProxy---queryUser()");
        userImpl.queryUser();
    }

    @Override
    public void updateUser() {
        System.out.println("UserProxy---updateUser()");
        userImpl.updateUser();
    }
}
