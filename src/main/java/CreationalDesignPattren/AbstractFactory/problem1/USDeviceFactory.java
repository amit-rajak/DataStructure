package CreationalDesignPattren.AbstractFactory.problem1;

public class USDeviceFactory implements DeviceFactory {
    @Override
    public Phone createPhone() {
        return new USPhone();
    }
    @Override
    public Laptop createLaptop() {
        return new USLaptop();
    }
}
