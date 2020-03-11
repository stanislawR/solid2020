package pl.zzpj2020.solid.lsp.shape;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    public double circuit() {
        return 2*Math.PI*getRadius();
    }
}
