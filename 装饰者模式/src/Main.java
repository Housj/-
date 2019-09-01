import coffee.Decaf;
import coffeebar.Drink;
import decorator.Chocolate;
import decorator.Milk;

public class Main {

    public static void main(String[] args) {

        Drink order = new Decaf();
        System.out.println("order1 price:"+order.cost());
        System.out.println("order1 desc:"+order.getDescription());
        System.out.println("************");

        order = new Decaf();
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Chocolate(order);
        System.out.println("order2 price:"+order.cost());
        System.out.println("order2 desc:"+order.getDescription());
    }
}
