package com.codingadvanced.ex11;

public class Circle implements Movable, Resizable {
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }

    @Override
    public void resize(double resizeFactor) {
        MoveDirection moveDirection = new MoveDirection(point.getX() * resizeFactor - point.getX(), point.getY() * resizeFactor - point.getY());
        point.move(moveDirection);
    }

    //Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1))
    public double getRadius() {
        return Math.sqrt(Math.pow((point.getY() - center.getY()), 2) + Math.pow((point.getX() - center.getX()), 2));
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
