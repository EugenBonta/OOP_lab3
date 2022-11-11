public class Rhombus extends Shape{
    double diagonal1;
    double diagonal2;

    public Rhombus(String color, double diagonal1, double diagonal2) {
        super(color);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    double area(){
        return diagonal1 * diagonal2 / 2;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "diagonal1=" + diagonal1 +
                ", diagonal2=" + diagonal2 +
                ", color='" + color + '\'' +
                ", area=" + area() +
                '}';
    }
}
