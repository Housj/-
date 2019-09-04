package 单纯享元.inter.impl;

import 单纯享元.inter.Shape;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
