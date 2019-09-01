package coffeebar;

/**
 * @author sergei
 * @create 2019-09-01
 */
public abstract class Drink {

    public String description = "";
    private float price = 0f;

    public abstract float cost();

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description+"-"+this.getPrice();
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
