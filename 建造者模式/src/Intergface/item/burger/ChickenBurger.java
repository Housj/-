package Intergface.item.burger;

import Intergface.item.Burger;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
