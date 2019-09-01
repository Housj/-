package decorator;


import coffeebar.Drink;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class Decorator extends Drink {
    private Drink Obj;

    public Decorator(Drink Obj){
        this.Obj = Obj;
    }

    @Override
    public float cost() {
        return super.getPrice()+Obj.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"-"+super.getPrice()+"&&"+Obj.getDescription();
    }
}
