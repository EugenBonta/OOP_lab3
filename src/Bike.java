class Bike implements Vehicle {

    int gear = 0;
    double speed;

    @Override
    public void gearUp(int gearUp) {
        gear += gearUp;
    }

    @Override
    public void gearDown(int gearDown) {
        gear -= gearDown;
    }

    @Override
    public void speed() {
        speed = Math.pow(gear, 3);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}
