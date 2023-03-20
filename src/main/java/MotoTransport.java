public abstract class MotoTransport extends Transport {

    public MotoTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public abstract void checkEngine();
}
