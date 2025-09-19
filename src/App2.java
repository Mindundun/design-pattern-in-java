// Factory pattern
public class App2 {
    public static void main(String[] args) {
        Car car1 = CarFactory.createCar();

        car1.start();
    }
}
