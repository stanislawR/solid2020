package pl.zzpj2020.solid.lsp.shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return getHeight()*getWidth();
    }

    @Override
    public double circuit() {
        return 2*getHeight()+2*getWidth();
    }
}
