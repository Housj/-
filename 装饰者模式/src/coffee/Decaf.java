package coffee;


/** 低咖 继承默认的咖啡
 * @author sergei
 * @create 2019-09-01
 */
public class Decaf extends Coffee {

    //传入自己的咖啡描述和价格
    public Decaf() {
        super.setDescription("Decaf");
        super.setPrice(3.0f);
    }
}
