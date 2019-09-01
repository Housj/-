package coffee;


/** 调料糖 继承默认的咖啡
 * @author sergei
 * @create 2019-09-01
 */
public class Sugar extends Coffee {

    //传入自己的描述和价格
    public Sugar() {
        super.setDescription("sugar");
        super.setPrice(2.0f);
    }
}
