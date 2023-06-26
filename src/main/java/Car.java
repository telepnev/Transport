public class Car extends MotoTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void updateTyre() {
        for (int i = 1; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку у машины " + getModelName() + " кол-во колес = " + i);
        }
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }
}
