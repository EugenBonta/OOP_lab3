class Bicycle implements Vehicle {

    int gear, speed;

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
        speed = gear * 2;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}
