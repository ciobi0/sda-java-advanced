package com.sdaJavaAdvanced.inheritance.exercise1;

public class Shape {
    private String name;
    private double perimeter;
    private double area;
    public Shape(String name, double perimeter, double area){
        this.name=name;
        this.perimeter=perimeter;
        this.area=area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void drawShape(){
        System.out.println("drawing a shape");
    }
}
