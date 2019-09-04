package staticproxy;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class UserImpl implements UserInfo {
    @Override
    public void queryUser() {
        System.out.println("UserImpl---queryUser()");
    }

    @Override
    public void updateUser() {
        System.out.println("UserImpl---updateUser()");
    }
}
