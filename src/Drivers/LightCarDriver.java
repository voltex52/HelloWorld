package Drivers;

import Cars.LightCar;

public class LightCarDriver {
    private String name;
    private boolean rights;
    private String driveTime;
    private LightCar lightCar;

    public LightCarDriver(String name, boolean rights, String driveTime) {
        this.name = name;
        this.rights = rights;
        this.driveTime = driveTime;
    }

    public void startMove() {
        System.out.println("Начать движение");
    };
    public void stopMove() {
        System.out.println("Остановиться");
    };
    public void getFuel() { System.out.println("Заправиться"); };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRights() {
        return rights;
    }

    public void setRights(boolean rights) {
        this.rights = rights;
    }

    public String getDriveTime() {
        return driveTime;
    }

    public void setDriveTime(String driveTime) {
        this.driveTime = driveTime;
    }

    public LightCar getLightCar() {
        return lightCar;
    }

    public void setLightCar(LightCar lightCar) {
        this.lightCar = lightCar;
    }

    @Override
    public String toString() {
        return "водитель " + name +
                " управляет автомобилем " + lightCar +
                " и будет участвовать в заезде";
    }
}
