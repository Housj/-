package Intergface.item.burger;

import Intergface.item.Burger;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
