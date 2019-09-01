package mode;

import internetweather.Observer;
import internetweather.Subject;

import java.util.ArrayList;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class WeatherDataSt implements Subject {

    private float temperatrue;
    private float pressure;
    private float humidity;
    private ArrayList<Observer> observers;

    public WeatherDataSt(){
        observers = new ArrayList<Observer>();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperatrue() {
        return temperatrue;
    }

    public void setDate(float temperatrue, float pressure, float humidity) {
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public void dataChange(){
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(getTemperatrue(),getPressure(),getHumidity()));
//        for (Observer observer : observers) {
//            observer.update(getTemperatrue(),getPressure(),getHumidity());
//        }
    }
}
