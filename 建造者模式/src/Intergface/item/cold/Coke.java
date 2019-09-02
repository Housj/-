package Intergface.item.cold;

import Intergface.item.ColdDrink;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
