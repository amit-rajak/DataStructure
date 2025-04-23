package CreationalDesignPattren.AbstractFactory.problem1;

public class AsiaDeviceFactory  implements  DeviceFactory{
    @Override
    public Phone createPhone() {
        return  new AsiaPhone();
    }
    @Override
    public Laptop createLaptop() {
        return  new AsiaLaptop();
    }
}
