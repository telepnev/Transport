

public class Main {
    public static void main(String[] args) {
        Transport car = new Car("Vesta", 4);
        Transport car2 = new Car("Mersedes-Bens", 4);
        Transport truck = new Truck("Kraz", 6);
        Transport truck2 = new Truck("Kamaz", 8);
        Transport bicycle = new Bicycle("Aist", 3);
        Transport bicycle2 = new Bicycle("Gain", 2);

        ServiceStation station = new ServiceStation();
        station.checkTransport(bicycle);
        station.checkTransport(bicycle2);
        station.checkTransport(car);
        station.checkTransport(car2);
        station.checkTransport(truck);
        station.checkTransport(truck2);


    }
}
