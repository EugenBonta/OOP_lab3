public class Main {
    public static void main(String[] args) {
        Circle objCircle = new Circle("red", 6.15);
        Rhombus objRhombus = new Rhombus("green", 4.2, 5.5);

        System.out.println("objCircle = " + objCircle);
        System.out.println("objRhombus = " + objRhombus);

        Bicycle objBicycle = new Bicycle();
        objBicycle.gearUp(5);
        objBicycle.gearDown(2);
        objBicycle.speed();
        System.out.println("objBicycle = " + objBicycle);

        Bike objBike = new Bike();
        objBike.gearUp(5);
        objBike.gearDown(2);
        objBike.speed();
        System.out.println("objBike = " + objBike);
    }
}