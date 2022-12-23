package Cars;

public class HardCar implements Сompeting {
    private String mark;
    private String model;
    private String engine;

    public HardCar(String mark, String model, String engine) {
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
        System.out.println("Пит-стоп грузовика");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время круга грузовика");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика");
    }

    @Override
    public String toString() {
        return mark;
    }
}
