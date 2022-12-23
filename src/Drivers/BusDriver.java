package Drivers;

import Cars.Bus;

public class BusDriver {
    private String name;
    private boolean rights;
    private String driveTime;
    private Bus bus;

    public BusDriver(String name, boolean rights, String driveTime) {
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

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "водитель " + name +
                " управляет автомобилем " + bus +
                " и будет участвовать в заезде";
    }
}
