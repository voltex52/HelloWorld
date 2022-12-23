package Drivers;

import Cars.HardCar;

public class HardCarDriver {
    private String name;
    private boolean rights;
    private String driveTime;
    private HardCar hardCar;

    public HardCarDriver(String name, boolean rights, String driveTime) {
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

    public HardCar getHardCar() {
        return hardCar;
    }

    public void setHardCar(HardCar hardCar) {
        this.hardCar = hardCar;
    }

    @Override
    public String toString() {
        return "водитель " + name +
        " управляет автомобилем " + hardCar +
                " и будет участвовать в заезде";
    }
}
