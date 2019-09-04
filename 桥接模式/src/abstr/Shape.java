package abstr;

import 单纯享元.inter.DrawAPI;

/**
 * @author sergei
 * @create 2019-09-02
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
