abstract class Shape {
    String color;
    float area;

    abstract double area();

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}