package CreationalDesignPattren.AbstractFactory.problem1;

public class EUDeviceFactory  implements  DeviceFactory{
    @Override
    public Phone createPhone() {
        return new EUPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new EULaptop();
    }
}
