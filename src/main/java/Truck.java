public class Truck extends MotoTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        for (int i = 1; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку у грузовика " + getModelName() + i);
        }

    }

    @Override
    public void checkEngine() {
        System.out.println("Меняем покрышку у грузовика " + getModelName());
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}
