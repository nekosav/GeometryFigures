package org.example;

public class Rectangle {
    private double a,b;

    public void rectangle(double a, double b){
        if ((a>0) & (b>0)) {
            this.a = a;
            this.b =b;
        }
        else {
            System.out.println("Такой прямоугольник не существует");

        }

    }
    public double square(){

        return a*b;
    }

    public double perimetr(){
        return 2*(a+b);
    }
}
