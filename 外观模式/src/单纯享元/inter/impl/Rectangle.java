package 单纯享元.inter.impl;

import 单纯享元.inter.Shape;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
