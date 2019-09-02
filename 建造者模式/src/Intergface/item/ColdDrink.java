package Intergface.item;

import Intergface.Item;
import Intergface.Packing;
import Intergface.pack.Bottle;

/**
 * @author sergei
 * @create 2019-09-01
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
