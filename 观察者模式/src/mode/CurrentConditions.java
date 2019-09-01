package mode;

import internetweather.Observer;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class CurrentConditions implements Observer {

    private float temperatrue;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperatrue, float pressure, float humidity) {
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("*** Today temperatrue:"+temperatrue);
        System.out.println("*** Today pressure:"+pressure);
        System.out.println("*** Today humidity:"+humidity);
    }
}
