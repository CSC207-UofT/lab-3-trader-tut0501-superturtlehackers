public class Car implements Drivable, Tradable {
    private int maxSpeed;

    public Car() {
        this.maxSpeed = 5;
    }
    @Override
    public void upgradeSpeed() {
        this.maxSpeed = this.maxSpeed + 2
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed = this.maxSpeed - 2;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
