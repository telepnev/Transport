public class Car extends MotoTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у легковой машины " + getModelName());
    }

    @Override
    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку у легковой машины " + getModelName());
        }
    }

    @Override
    public void service() {
        checkEngine();
        updateTyre();
    }
}
