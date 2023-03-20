public class Bicycle extends Transport{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        for (int i = 1; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку у велосипеда " + getModelName() + " кол-во колес = " + i);
        }
    }

    @Override
    public void service() {
        updateTyre();
    }
}
