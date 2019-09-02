package Intergface.item.cold;

import Intergface.item.ColdDrink;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
