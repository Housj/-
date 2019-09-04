package impl;

import 单纯享元.inter.DrawAPI;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
