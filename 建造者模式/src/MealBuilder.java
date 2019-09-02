import Intergface.item.burger.ChickenBurger;
import Intergface.item.burger.VegBurger;
import Intergface.item.cold.Coke;
import Intergface.item.cold.Pepsi;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
