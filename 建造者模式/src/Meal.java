import Intergface.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        //items.forEach(item -> cost += item.price());
        for (Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        items.forEach(item -> System.out.println("Item:"+item.name()+", Packing:"+item.packing().pack()+", price:"+item.price()));
    }

}
