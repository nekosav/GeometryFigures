package org.example;

public class Circle {
    private double R;

    public void circle(double r){
        if (r>0) R=r;
    }
    public double square(){
        return Math.PI*R*R;
    }
    public double perimetr(){
        return 2*Math.PI*R;
    }
}
