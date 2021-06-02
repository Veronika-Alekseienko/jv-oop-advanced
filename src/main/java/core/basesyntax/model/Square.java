package core.basesyntax.model;

public class Square extends Figure {
    private double side;

    public Square(double side, String name, String color) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + getArea() + " sq. units, side: " + side
                + " units, color: " + getColor());
    }
}