package Intergface.item;

import Intergface.Item;
import Intergface.Packing;
import Intergface.pack.Wrapper;

/**
 * @author sergei
 * @create 2019-09-01
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
