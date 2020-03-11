package pl.zzpj2020.solid.lsp.shape;

public class Square extends Shape {
    public double width;

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double area() {
        return getWidth()*getWidth();
    }

    @Override
    public double circuit() {
        return getWidth()*4;
    }
}
