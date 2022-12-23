import Cars.Bus;
import Cars.HardCar;
import Cars.LightCar;
import Drivers.BusDriver;

public class App {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Икарус","100","5L");
        Bus bus2 = new Bus("Паз","200","3L");
        Bus bus3 = new Bus("Маз","300","6L");
        Bus bus4 = new Bus("Хёндай","400","4L");

        LightCar lightCar1 = new LightCar("Жигули","10","1.5L");
        LightCar lightCar2 = new LightCar("Волга","20","2.5L");
        LightCar lightCar3 = new LightCar("Ока","30","0.5L");
        LightCar lightCar4 = new LightCar("Запорожец","40","3.5L");

        HardCar hardCar1 = new HardCar("Камаз","1","7L");
        HardCar hardCar2 = new HardCar("Маз","2","8L");
        HardCar hardCar3 = new HardCar("Мерседес","3","9L");
        HardCar hardCar4 = new HardCar("Скания","4","10L");

        BusDriver busDriver = new BusDriver("Иванов Иван Иванович",true,"40 лет");
        busDriver.setBus(bus1);

        System.out.println(busDriver);
    }

}