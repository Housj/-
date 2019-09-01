package coffee;

import coffeebar.Drink;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class Coffee extends Drink {

    /**
     *  咖啡单品只有默认的价格，所以直接返回
     * @return
     */
    @Override
    public float cost() {
        return super.getPrice();
    }
}
