package com.mjc.stage2.impl;


import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements Observer {
    RectangleWarehouse rectangleWarehouse = RectangleWarehouse.getInstance();
    @Override
    public void handleEvent(RectangleEvent event) {
        Rectangle rectangle = event.getSource();
        double a = rectangle.getSideA();
        double b = rectangle.getSideA();
        double square = a*b;
        double perimeter = a+a+b+b;
        RectangleValues values = rectangleWarehouse.get(rectangle.getId());
        values.setSquare(square);
        values.setSquare(perimeter);
        rectangleWarehouse.put(rectangle.getId(),values);
    }

    // Write your code here!
}
