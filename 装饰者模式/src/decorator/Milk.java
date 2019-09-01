package decorator;

import coffeebar.Drink;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class Milk extends Decorator {

    public Milk(Drink Obj) {
        super(Obj);
        super.setDescription("Milk");
        super.setPrice(2.0f);
    }
}
