package transport;

import service.Serviceable;

public abstract class Transport implements Serviceable {

    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }


    @Override
    public void check() {
        System.out.println("Обслуживаем " + modelName);
        System.out.println("Обслуживаем колеса");
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}

