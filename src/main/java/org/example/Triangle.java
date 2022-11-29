package org.example;

public class Triangle {
    private double a,b,c;

    public void triangle(double a,double b,double c){
        if ((a>0) & (b>0) & (c>0)){
            if ((a+b>c) & (a+c>b) &(b+c>a)) {
                this.a =a;
                this.b = b;
                this.c =c;
            }
        }
        else System.out.println("Такой треугольник не существует");
    }
    public double square(){
        double p= (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
    public double perimetr(){
        return a+b+c;
    }
}
