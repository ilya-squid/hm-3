import service.ServiceStation;
import transport.Bicycle;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();

        Truck truck = new Truck("Камаз", 8);
        serviceStation.check(truck);

        Car car = new Car("Cadillac", 4);
        serviceStation.check(car);

        Bicycle bicycle = new Bicycle("BMX", 2);
        serviceStation.check(bicycle);
    }
}