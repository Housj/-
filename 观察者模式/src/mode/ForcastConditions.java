package mode;

import internetweather.Observer;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class ForcastConditions implements Observer {

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
        System.out.println("*** 明天温度 temperatrue:"+Math.random());
        System.out.println("*** 明天气压 pressure:"+Math.random());
        System.out.println("*** 明天湿度 humidity:"+Math.random());
    }
}
