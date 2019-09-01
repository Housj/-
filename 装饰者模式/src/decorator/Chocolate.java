package decorator;

import coffeebar.Drink;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink Obj) {
        super(Obj);
        super.setDescription("Chocolate");
        super.setPrice(3.0f);
    }
}
