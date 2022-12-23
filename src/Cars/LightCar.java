package Cars;

public class LightCar implements Сompeting {
    private String mark;
    private String model;
    private String engine;

    public LightCar(String mark, String model, String engine) {
        this.mark = mark;
        this.model = model;
        this.engine = engine;
    }

    public void startMove() {
        System.out.println("Начать движение");
    };
    public void endMove() {
        System.out.println("Закончить движение");
    };

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп легковой машины");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время круга легковой машины");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость легковой машины");
    }

    @Override
    public String toString() {
        return mark;
    }
}
