import java.util.Date;

/**
 * @author sergei
 * @create 2019-09-03
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
    }

}
