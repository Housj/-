import mode.CurrentConditions;
import mode.ForcastConditions;
import mode.WeatherDataSt;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class Main {
    public static void main(String[] args) {

        WeatherDataSt weatherDataSt = new WeatherDataSt();
        CurrentConditions currentConditions = new CurrentConditions();
        ForcastConditions forcastConditions = new ForcastConditions();
        weatherDataSt.registerObserver(currentConditions);
        weatherDataSt.registerObserver(forcastConditions);
        weatherDataSt.setDate(30,40,50);

        weatherDataSt.removeObserver(forcastConditions);
        weatherDataSt.setDate(20,30,40);
    }
}
